package edu.escuelaing.arep.estudiantes.entidades;

public class Estudiante{

    private String nombre;
    private int codigo;
    private String carrera;

    public Estudiante(String nombre, int codigo, String carrera){
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCarrera(){
        return carrera;
    }
}