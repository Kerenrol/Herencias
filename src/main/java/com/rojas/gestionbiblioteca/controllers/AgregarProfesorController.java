package com.rojas.gestionbiblioteca.controllers;

import com.rojas.gestionbiblioteca.HelloApplication;
import com.rojas.gestionbiblioteca.models.Alumnos;
import com.rojas.gestionbiblioteca.models.Profesores;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class AgregarProfesorController {

    @FXML
    private Button agregarBtn;

    @FXML
    private Button salirBtn;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtArea;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    void OnMouseClickAgregarBtn(MouseEvent event) {
        ArrayList<Profesores> profesores = HelloApplication.getPersona().getListaProfesores();

        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String edad = txtEdad.getText();
        String area = txtArea.getText();

        Profesores profesor = new Profesores(nombre, apellidos, edad, area);

        if (profesores.add(profesor)) {

            mostrarAlerta("Éxito", "Se ha agregado un nuevo usuario.");

            System.out.println("Se ha agregado un nuevo usuario:");
            System.out.println("Nombre: " + profesor.getNombre());
            System.out.println("Apellidos: " + profesor.getApellidos());
            System.out.println("Edad: " + profesor.getEdad());
            System.out.println("Área: "+profesor.getArea());
        }
        limpiarCampos();
    }

    @FXML
    void OnMouseClickSalirBtn(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    private void limpiarCampos() {
        txtNombre.clear();
        txtApellidos.clear();
        txtEdad.clear();
        txtArea.clear();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

}
