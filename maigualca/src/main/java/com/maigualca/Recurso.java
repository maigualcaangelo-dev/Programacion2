package com.maigualca;

public class Recurso {

    protected String id;
    protected String titulo;
    protected boolean disponible;

    public Recurso(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = true;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarFichaTecnica() {
        System.out.println("--------------------------------");
        System.out.println("ID     : " + id);
        System.out.println("Título : " + titulo);
        System.out.println("Estado : " + (disponible ? "Disponible" : "Prestado"));
    }   
}