package com.maigualca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Recurso> inventario;

    public Biblioteca() {
        inventario = new ArrayList<>();
    }

    public void registrarRecurso(Recurso recurso) {
        inventario.add(recurso);
        System.out.println("Recurso agregado");
    }

    public void mostrarInventario() {
        System.out.println("\n------ INVENTARIO ------");
        for (Recurso r : inventario) {
            r.mostrarFichaTecnica();
        }
    }

    public Recurso buscarPorId(String idBuscado) {
        for (Recurso r : inventario) {
            if (r.getId().equals(idBuscado)) {
                return r;
            }
        }
        return null;
    }
}