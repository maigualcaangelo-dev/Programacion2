package com.maigualca;

public class Main {
    public static void main(String[] args) {

        Biblioteca miBiblioteca = new Biblioteca();

        // CREAR LIBRO
        Libro libro1 = new Libro("L001","Cien años de soledad","Gabriel García Márquez",471);
        
        // CREAR REVISTA
        Revista revista1 = new Revista("E201","ESIKA","Mayo",235);
        
        // CREAR DIGITAL
        Digital digital1 = new Digital("D001","Analisis Matematico","TXT");
        
        // REGISTRAR EN EL SISTEMA
        miBiblioteca.registrarRecurso(libro1);
        miBiblioteca.registrarRecurso(revista1);
        miBiblioteca.registrarRecurso(digital1);
        
        // MOSTRAR TODOS LOS RECURSOS Y SUS ATRIBUTOS
        miBiblioteca.mostrarInventario();
        
        // PRUEBA DE BUSQUEDA
        System.out.println("\nBuscando recurso...");
        Recurso encontrado = miBiblioteca.buscarPorId("L001");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getTitulo());
        }
    }
}