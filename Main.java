package com.arreglos;
 
public class Main {
 
    public static void main(String[] args) {
 
        Curso[][] sucursales = {
            {  
                new Curso("Matemáticas", 18),
                new Curso("Física", 25),
                new Curso("Química", 20)
            },
 
            {   
                new Curso("Matemáticas", 32),
                new Curso("Física", 15),
                new Curso("Química", 28),
                new Curso("Biología", 32),
                new Curso("Historia", 32),
                new Curso("Geografía", 32)
            },
 
            {  
                new Curso("Literatura", 18),
                new Curso("Artes", 25),
                new Curso("Botánica", 20),
                new Curso("Programación", 34)
            }
        };
 
        for (int i = 0; i < sucursales.length; i++) {
 
            System.out.println("\n=== SUCURSAL " + (char)('A' + i) + " ===");
 
            for (int j = 0; j < sucursales[i].length; j++) {
                System.out.println(sucursales[i][j]);
            }
        }
    }
}
 