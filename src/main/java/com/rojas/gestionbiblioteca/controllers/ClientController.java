package com.rojas.gestionbiblioteca.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import com.rojas.gestionbiblioteca.HelloApplication;
import com.rojas.gestionbiblioteca.models.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ClientController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField apellidoTxt;

    @FXML
    private TextField nameTxt;

    @FXML
    private Button closeButton;

    @FXML
    private Button guardarButton;

    @FXML
    private Label confirmationLabel;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void onClickGuardarButton(MouseEvent event) {
        ArrayList<Usuario> usuarios = HelloApplication.getBiblioteca().getClients();
        String nombre = nameTxt.getText();
        String apellido = apellidoTxt.getText();
        Usuario user = new Usuario(nombre, apellido);
        if (usuarios.add(user)){
            confirmationLabel.setVisible(true);
        }
        limpiarCampos();
    }

    private void limpiarCampos() {
        nameTxt.clear();
        apellidoTxt.clear();
    }

    @FXML
    void initialize() {
        closeButton.getStyleClass().setAll("btn","btn-success");
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
    }
}
