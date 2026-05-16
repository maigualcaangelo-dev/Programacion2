package com.maigualca;

public class Revista extends Recurso {

    private String mes;
    private int edicion;

    public Revista(String id, String titulo,String mes, int edicion) {
        super(id, titulo);
        this.mes = mes;
        this.edicion = edicion;
    }
    
    public String getMes() {
        return mes;
    }
    
    public int getEdicion() {
        return edicion;
    }
    
    @Override
    public void mostrarFichaTecnica() {
        System.out.println("--------------------------------");        
        System.out.println("Revista:");
        super.mostrarFichaTecnica();
        System.out.println("Mes    : " + mes);
        System.out.println("Edición: " + edicion);
    }
}