package com.rojas.gestionbiblioteca.controllers;

import com.rojas.gestionbiblioteca.HelloApplication;
import com.rojas.gestionbiblioteca.models.Alumnos;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class AgregarAlumnoController {

    @FXML
    private Button agregarBtn;

    @FXML
    private Button salirBtn;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtGrado;

    @FXML
    private TextField txtNombre;

    @FXML
    void OnMouseClickAgregarBtn(MouseEvent event) {
        ArrayList<Alumnos> alumnos = HelloApplication.getPersona().getListaAlumnos();

        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String edad = txtEdad.getText();
        String grado = txtGrado.getText();

        Alumnos alumno = new Alumnos(nombre, apellidos, edad, grado);

        if (alumnos.add(alumno)) {

            mostrarAlerta("Éxito", "Se ha agregado un nuevo usuario.");

            System.out.println("Se ha agregado un nuevo usuario:");
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellidos: " + alumno.getApellidos());
            System.out.println("Edad: " + alumno.getEdad());
            System.out.println("Grado: "+alumno.getGrado());
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
        txtGrado.clear();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
