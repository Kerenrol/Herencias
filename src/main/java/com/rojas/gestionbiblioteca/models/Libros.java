package com.rojas.gestionbiblioteca.models;

import java.util.ArrayList;

public class Libros {
    private String titulo;
    private String autor;
    private String idioma;
    private String editorial;
    private String cantidadDisponible;

    private ArrayList<Libros> listaLibros;

    public Libros() {
        listaLibros = new ArrayList<>();
    }

    public ArrayList<Libros> getListaLibros() {
        return listaLibros;
    }

    public Libros(String titulo, String autor, String idioma, String editorial, String cantidadDisponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.editorial = editorial;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(String cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}

