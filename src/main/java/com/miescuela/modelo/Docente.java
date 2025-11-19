/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miescuela.modelo;

/**
 *
 * @author ferlo
 */
public class Docente {
    private final String nombre;
    private int edad;
    private String materiaQueImparte;
    private int cubiculo;

    public Docente(String nombre, int edad, String materiaQueImparte, int cubiculo) {
        this.nombre = nombre;
        this.edad = edad;
        this.materiaQueImparte = materiaQueImparte;
        this.cubiculo = cubiculo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateriaQueImparte() {
        return materiaQueImparte;
    }

    public void setMateriaQueImparte(String materiaQueImparte) {
        this.materiaQueImparte = materiaQueImparte;
    }

    public int getCubiculo() {
        return cubiculo;
    }

    public void setCubiculo(int cubiculo) {
        this.cubiculo = cubiculo;
    }
    
    
}
