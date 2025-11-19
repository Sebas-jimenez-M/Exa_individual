package com.miescuela.modelo;

/**
 * Clase de Asociación: Conecta un Alumno con una Materia.
 * Responsable de guardar la calificación.
 * Versión básica.
 */
public class Inscripcion extends Alumno{

   
    private Materia materia;
    private Double calificacion;
    private Alumno alumno;
    
    public Inscripcion() {
    }

    public Inscripcion(Materia materia, Double calificacion,Alumno alumno) {
        this.materia = materia;
        this.calificacion = calificacion;
        this.alumno = alumno;
    }

    public Inscripcion(Materia materia, Double calificacion, String matricula, String nombre) {
        super(matricula, nombre);
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

}