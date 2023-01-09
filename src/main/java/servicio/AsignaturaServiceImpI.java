/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Asignatura;

/**
 *
 * @author ochoa
 */
public class AsignaturaServiceImpI implements AsignaturaService {

    private static List<Asignatura> asignaturaList = new ArrayList<>();

    @Override
    public void crear(Asignatura asignatura) {
        this.asignaturaList.add(asignatura);
    }

    @Override
    public Asignatura codigoAsignautra(int codigo) {

        Asignatura barco = null;
        for (var b : this.asignaturaList) {
            if (codigo == b.getCodigo()) {
                barco = b;
                break;
            }
        }
        return barco;
    }

    @Override
    public List<Asignatura> listar() {

        return this.asignaturaList;
    }

    @Override
    public Asignatura buscarNombre(String nombre) {
        Asignatura retorno = null;

        for (var ciudad : this.asignaturaList) {
            if (nombre.equals(ciudad.getPlanEstudio())) {
                retorno = ciudad;
                break;
            }
        }

        return retorno;
    }

    @Override
    public void eliminar(int codigo) {
        
        var indice = 0;
        for(var materia: this.asignaturaList)
            if(materia.getCodigo()==codigo){
                this.asignaturaList.remove(indice);
                break;
            }else{
                indice++;
            }
        
        
        
    }

    @Override
    public void modificar(int condigo, Asignatura asignatura) {
    
        var indice=0;
        
        this.asignaturaList.set(indice, asignatura);
    }
}
