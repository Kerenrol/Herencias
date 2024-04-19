package com.rojas.gestionbiblioteca.controllers;

import com.rojas.gestionbiblioteca.HelloApplication;
import com.rojas.gestionbiblioteca.models.Libros;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class BuscarLibroController {

    @FXML
    private Button buscarButton;

    @FXML
    private Button closeButton;

    @FXML
    private Label confirmacionTxt;

    @FXML
    private TextField txtAutor;

    @FXML
    private TextField txtBuscar;

    @FXML
    private TextField txtCantidad;

    @FXML
    private TextField txtEditorial;

    @FXML
    private TextField txtNombre;

    @FXML
    void onClickBuscarButton(MouseEvent event) {
        String nombreBuscado = this.txtBuscar.getText();
        ObservableList<Libros>list = HelloApplication.getLibros();

        Libros libroEncontrado =null;
        for (Libros libros : list) {
            if (libros.getTitulo().equals(nombreBuscado)) {
                libroEncontrado = libros;
                break;
            }
            mostrarAlerta("Error", "No se encontró nigún libro con ese nombre.");
        }

        if (libroEncontrado != null) {
            txtNombre.setText(String.valueOf(libroEncontrado.getTitulo()));
            txtAutor.setText(String.valueOf(libroEncontrado.getAutor()));
            txtCantidad.setText(String.valueOf(libroEncontrado.getCantidadDisponible()));
            txtEditorial.setText(String.valueOf(libroEncontrado.getEditorial()));
        } else {
        }
    }

    @FXML
    void onClickCloseButton(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

}
