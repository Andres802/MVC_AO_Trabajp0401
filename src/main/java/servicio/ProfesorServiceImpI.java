/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Profesor;

/**
 *
 * @author ochoa
 */
public class ProfesorServiceImpI implements ProfesorService{

    private static List<Profesor> profesorList;

    public ProfesorServiceImpI() {

        this.profesorList = new ArrayList<>();

    }
    
    @Override
    public void crear(Profesor profesor) {
        
        this.profesorList.add(profesor);
        
    }
    @Override
    public Profesor codigoProfesor(int codigo) {
        
        Profesor retorno = null;
        for(var profesor:this.profesorList){
            if(codigo==profesor.getCodigo()){
                retorno = profesor;
                break;
            }
        }
        return retorno;
    }

    @Override
    public List<Profesor> listar() {
        
        return this.profesorList;
        
    }

    @Override
    public Profesor bucarNombre(String nombre) {
    
         Profesor retorno = null;
        
        for(var ciudad:this.profesorList){
            if(nombre.equals(ciudad.getNombre())){
                retorno=ciudad;
                break;
            }
        }

        return retorno;
    }

    @Override
    public void eliminar(int codigo) {
        var indice = 0;
        for(var materia: this.profesorList)
            if(materia.getCodigo()==codigo){
                this.profesorList.remove(indice);
                break;
            }else{
                indice++;
            }
    }
    

   
    
    
    
}
