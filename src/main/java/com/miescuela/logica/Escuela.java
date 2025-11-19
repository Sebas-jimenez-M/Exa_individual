/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miescuela.logica;

import com.miescuela.modelo.*;
import java.awt.List;
import java.util.ArrayList;
/**
 *
 * @author erick
 */
public class Escuela {
    
   public static ArrayList<Alumno> Alumnos = new ArrayList<>();
   public static ArrayList<String> NAlumnos = new ArrayList<>();
   public static ArrayList<String> Docentes = new ArrayList<>();
   private final ArrayList<Materia> Materias = new ArrayList<>();
   private static ArrayList<String> NMaterias = new ArrayList<>();
   
   public static ArrayList<String> getNombres() {
        return NAlumnos;
    }
   public static ArrayList<String> getNombres2() {
        return Docentes;
    }
   public static ArrayList<String> getNombres3() {
        return NMaterias;
    }
   
   public void agregarProfesor(String nombre, int edad, String materiaQueImparte, int cubiculo){
       Docente d1 = new Docente(nombre, edad, materiaQueImparte, cubiculo);
       System.out.println("Profesor: "+d1.getNombre()+" inscrito");
       Docentes.add(d1.getNombre());
   }
   public void inscribirMateria(String clave, String nombre){
       Materia m1 = new Materia(clave, nombre);
       System.out.println("Materia "+m1.getNombre()+" Asignada");
       Materias.add(m1);
       NMaterias.add(m1.getNombre());
       System.out.println(Materias);
   }
   public void agregarAlumno(String matricula,String nombre){
       Alumno a1 = new Alumno(matricula, nombre);
       System.out.println("Almuno: "+a1.getNombre()+" inscrito");
       Alumnos.add(a1);
       System.out.println(Alumnos);
       NAlumnos.add(a1.getNombre());
   }
}
