package com.rojas.gestionbiblioteca.models;

public class Idiomas extends Libros{
    String idiomas;

    public Idiomas(String nombre, String autor, String idiomas) {
        super(nombre, autor);
        this.idiomas = idiomas;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }
}
