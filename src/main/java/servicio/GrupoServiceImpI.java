/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Grupo;

/**
 *
 * @author ochoa
 */
public class GrupoServiceImpI implements GrupoService{

    private static List<Grupo> grupoList;

    public GrupoServiceImpI() {

        this.grupoList = new ArrayList<>();

    }
    
    @Override
    public void crear(Grupo grupo) {
        
        this.grupoList.add(grupo);        
    }

    @Override
    public List<Grupo> listar() {
        
        return this.grupoList;
        
    }

    @Override
    public void eliminar(int codigo) {
        this.grupoList.remove(codigo);
    }

    @Override
    public boolean codigoEliminar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean grupoExiste(int codigo) {
    
        var retorno = false;
        for (var materia : this.grupoList) {
            if (codigo == materia.getNumeroGrupo()) {
                retorno = true;
                break;
            }
        }
    return retorno;
    }

    @Override
    public boolean aulaExiste(int codigo) {
    
        var retorno = false;
        for (var materia : this.grupoList) {
            if (codigo == materia.getAula()) {
                retorno = true;
                break;
            }
        }
    return retorno;
    
    }
    
}
