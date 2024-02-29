package com.rojas.gestionbiblioteca.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import com.rojas.gestionbiblioteca.HelloApplication;
import com.rojas.gestionbiblioteca.models.Libros;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class BookController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label confirmacionTxt;

    @FXML
    private Button closeButton;

    @FXML
    private Button guardarButton;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtAutor;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void onClickGuardarButton(MouseEvent event){
        ArrayList<Libros> listaLibros = HelloApplication.getBiblioteca().getListaLibros();
        String nombre = txtNombre.getText();
        String autor = txtAutor.getText();
        Libros libro = new Libros(nombre, autor);
        if (listaLibros.add(libro)) {
            confirmacionTxt.setVisible(true);
        }
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNombre.clear();
        txtAutor.clear();
    }

    @FXML
    void initialize() {
        closeButton.getStyleClass().setAll("btn", "btn-success");
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");

        guardarButton.getStyleClass().setAll("btn", "btn-success");
        guardarButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
    }
}