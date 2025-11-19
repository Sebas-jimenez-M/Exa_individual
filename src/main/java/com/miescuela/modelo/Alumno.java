package com.miescuela.modelo;

/**
 * Clase Alumno (mínima y básica)
 * Requerida para que Inscripcion.java compile.
 */
public class Alumno {

    private String matricula;
    private String nombre;

    public Alumno() {
    }

    public Alumno(String matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
