package com.rojas.gestionbiblioteca.models;

import java.time.LocalDate;

public class Prestamos {
    private int id;
    private String date;
    private String usuario;
    private String libros;

    public Prestamos(String date, String usuario, String libros) {
        this.date = date;
        this.usuario = usuario;
        this.libros = libros;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLibros() {
        return libros;
    }

    public void setLibros(String libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Prestamo{"+
                "ID: " + id +
                ", FECHA: " + date +
                ", LIBRO: " + libros +
                ", USUARIO: " + usuario +
                '}';
    }
}
