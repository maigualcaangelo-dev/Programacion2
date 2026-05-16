package com.maigualca;

public class Digital extends Recurso {

    private String formato;

    public Digital(String id, String titulo,String formato) {
        super(id, titulo);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public void mostrarFichaTecnica() {
        System.out.println("--------------------------------");
        System.out.println("Digital:");
        super.mostrarFichaTecnica();
        System.out.println("Formato: " + formato);
    }
}