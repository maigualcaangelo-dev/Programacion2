package com.maigualca;

public class Libro extends Recurso {

    private String autor;
    private int  paginas;

    public Libro(String id, String titulo, String autor, int paginas) {
        super(id, titulo);
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getPaginas() {
        return paginas;
    }
    
    @Override
    public void mostrarFichaTecnica() {
        System.out.println("--------------------------------");
        System.out.println("Libro:");
        super.mostrarFichaTecnica();
        System.out.println("Autor  : " + autor);
        System.out.println("Páginas: " + paginas);
    }
}