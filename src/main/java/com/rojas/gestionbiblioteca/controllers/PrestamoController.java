package com.rojas.gestionbiblioteca.controllers;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.rojas.gestionbiblioteca.models.Libros;
import com.rojas.gestionbiblioteca.models.Usuario;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import com.rojas.gestionbiblioteca.HelloApplication;
import com.rojas.gestionbiblioteca.models.Prestamos;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class PrestamoController {

    @FXML
    private Button closeButton;

    @FXML
    private Label confirmationLabel;

    @FXML
    private Button guardarButton;

    @FXML
    private TextField txtCliente;

    @FXML
    private TextField txtFecha;

    @FXML
    private TextField txtLibro;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void onClickGuardarButton(MouseEvent event) {
        ArrayList<Prestamos> prestamo = HelloApplication.getBiblioteca().getListaPrestamos();
        String fecha = txtFecha.getText();
        String usuario = txtCliente.getText();
        String libros =  txtLibro.getText();
        Prestamos prestar = new Prestamos(fecha, usuario, libros);
        if (prestamo.add(prestar)) {
            confirmationLabel.setVisible(true);
        }
    }

    private void limpiarCampos() {
        txtCliente.clear();
        txtLibro.clear();
        txtFecha.clear();
    }

    @FXML
    void initialize() {
        closeButton.getStyleClass().setAll("btn", "btn-success");
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");

        guardarButton.getStyleClass().setAll("btn", "btn-success");
        guardarButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
    }
}
