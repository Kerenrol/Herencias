package com.rojas.gestionbiblioteca.models;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Prestamos> listaPrestamos = new ArrayList<>();
    private ArrayList<Usuario> clients = new ArrayList<>();
    private ArrayList<Libros> listaLibros = new ArrayList<>();

    public boolean addCita(Prestamos cita){
        return listaPrestamos.add(cita);
    }
    /*public boolean updatePrestamos(Prestamos cita){return true;}
    public boolean addClient(Usuario client){
        return clients.add(client);
    }*/

    public boolean addLibro(Libros libro) {
        return listaLibros.add(libro);
    }

    public ArrayList<Libros> getListaLibros() {
        return listaLibros;
    }

    public ArrayList<Prestamos> getListaPrestamos() {
        return listaPrestamos;
    }

    public ArrayList<Usuario> getClients() {
        return clients;
    }
}

