/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Profesor;
import servicio.ProfesorServiceImpI;

/**
 *
 * @author ochoa
 */
public class ProfesorControlador {
    
     private ProfesorServiceImpI profesorServi = new ProfesorServiceImpI();

    public void crear(String[] data) {
        var codigo = Integer.valueOf(data[0]);
        var nombre = data[1];
        var year = Integer.valueOf(data[2]);
        var mes = Integer.valueOf(data[3]);
        var dia = Integer.valueOf(data[4]);
        var profesion = data[5];
        var correo = data[6];
        var genero = data[7];
        var profesor = new Profesor(codigo,nombre,LocalDate.of(year, mes, dia),profesion,correo,genero);
        
        this.profesorServi.crear(profesor);
    }
    
    public List<Profesor>listar(){
        return this.profesorServi.listar();
    }
    public void eliminar(String[] data){
        
        var codigo = Integer.valueOf(data[0]);
        
        this.profesorServi.eliminar(codigo);
        
     }
}
