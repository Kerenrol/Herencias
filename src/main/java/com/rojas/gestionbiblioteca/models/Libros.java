package com.rojas.gestionbiblioteca.models;

public class Libros {
    protected String nombre;
    protected String autor;

    public Libros() {
    }

    public Libros(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

