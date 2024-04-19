package com.rojas.gestionbiblioteca.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import com.rojas.gestionbiblioteca.HelloApplication;
import com.rojas.gestionbiblioteca.models.Libros;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class BookController {

    @FXML
    private Button closeButton;

    @FXML
    private Label confirmacionTxt;

    @FXML
    private Button guardarButton;

    @FXML
    private TextField txtAutor;

    @FXML
    private TextField txtCantidad;

    @FXML
    private TextField txtEditorial;

    @FXML
    private TextField txtNombre;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void onClickGuardarButton(MouseEvent event){
    String titulo = this.txtNombre.getText();
    String autor = this.txtAutor.getText();
    String editorial = this.txtEditorial.getText();
    String cantidad = this.txtCantidad.getText();

    Libros libro= new Libros(titulo, autor, editorial, cantidad);

    if (!HelloApplication.getLibros().contains(libro)) {
        HelloApplication.getLibros().add(libro);

        mostrarAlerta("Éxito", "Se ha agregado un nuevo libro.");

        System.out.println("Se agregó el libro: ");
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Editorial: "+editorial);
        System.out.println("Cantidad Disponible: "+cantidad);
        }
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNombre.clear();
        txtAutor.clear();
        txtEditorial.clear();
        txtCantidad.clear();
    }

    @FXML
    void initialize() {
        closeButton.getStyleClass().setAll("btn", "btn-success");
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");

        guardarButton.getStyleClass().setAll("btn", "btn-success");
        guardarButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}