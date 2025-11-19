/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miescuela.main;
import com.miescuela.logica.Escuela;
import com.miescuela.ui.*;
/**
 *
 * @author erick
 */
public class Main {
    public static void main(String[] args) {
        Escuela itses = new Escuela();
        itses.agregarAlumno("MOI06","Benja");
        itses.agregarAlumno("carlo456","Carlos");
        itses.agregarAlumno("Sebas56i9","Sebastian");
        itses.agregarProfesor("Alexis",27,"POO 2",3);
        itses.agregarProfesor("Ivan",35,"Circuitos",4);
        itses.agregarProfesor("Peter",27,"Sensores",5);
        itses.inscribirMateria("1092","POO 2");
        itses.inscribirMateria("1234","Circuitos");
        itses.inscribirMateria("13445","Sensores");
        VentanaPrincipal v = new VentanaPrincipal();
        v.setVisible(true);
        
        
    }
}
