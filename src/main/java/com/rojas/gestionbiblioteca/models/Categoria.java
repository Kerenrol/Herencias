package com.rojas.gestionbiblioteca.models;

public class Categoria extends Libros {
    private String categoria;
    public Categoria(String nombre, String autor, String categoria) {
        super(nombre, autor);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
