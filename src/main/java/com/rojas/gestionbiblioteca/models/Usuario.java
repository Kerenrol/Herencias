package com.rojas.gestionbiblioteca.models;

public class Usuario {
    private int id;
    private String name;
    private String apellido;

    public Usuario(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }

    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
