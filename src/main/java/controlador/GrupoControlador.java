/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Grupo;
import servicio.GrupoServiceImpI;
import servicio.*;


/**
 *
 * @author ochoa
 */
public class GrupoControlador {
    
     private  GrupoServiceImpI grupoServi = new GrupoServiceImpI();
     private  AsignaturaServiceImpI asignaturaServi = new AsignaturaServiceImpI();
     private ProfesorServiceImpI profesorServi = new ProfesorServiceImpI();
    
    public void crear(String[] data) {
        var numeroGrupo = Integer.valueOf(data[0]);
        var aula = Integer.valueOf(data[1]);
        var numeroAlumnos = Integer.valueOf(data[2]);
        var nivelCiclo= data[3];
        var asignatura = this.asignaturaServi.codigoAsignautra(Integer.valueOf(data[4]));
        var profesor = this.profesorServi.codigoProfesor(Integer.valueOf(data[5]));
        
        var grupo = new Grupo(numeroGrupo,aula,numeroAlumnos,nivelCiclo,asignatura,profesor);
        this.grupoServi.crear(grupo);
        
        
    }
    
    public List<Grupo>listar(){
        return this.grupoServi.listar();
    }
    
    public void eliminar(int data){
        this.grupoServi.eliminar(data);
    }
}
