package com.arreglos;

import java.util.Random;

public final class Curso {
    
    private final String nombreCurso;
    private final int cantidadMaxima;
    private final int cantidadInscritos;

    public Curso(String nombreCurso, int cantidadInscritos) {
        this.nombreCurso = nombreCurso;

        Random random  = new Random();
        this.cantidadMaxima = random.nextInt(16) + 20;
        
        if(cantidadInscritos > cantidadMaxima){
            System.out.println("El número de alumnos no puede exceder a " + cantidadMaxima);
            this.cantidadInscritos = cantidadMaxima;
        } else {
            this.cantidadInscritos = cantidadInscritos;
        }
    }

    @Override
    public String toString(){
        return "Curso          : " + nombreCurso +
               "Inscritos      : " + cantidadInscritos +
               "CapacidadMaxima: " + cantidadMaxima; 
    }
}
