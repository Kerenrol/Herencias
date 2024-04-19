package com.rojas.gestionbiblioteca.controllers;

import com.rojas.gestionbiblioteca.HelloApplication;
import com.rojas.gestionbiblioteca.models.Prestamos;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PrestamoController {

    @FXML
    private Button closeButton;

    @FXML
    private Label confirmationLabel;

    @FXML
    private Label confirmationLable;

    @FXML
    private Button guardarButton;

    @FXML
    private TextField txtCliente;

    @FXML
    private TextField txtFechafin;

    @FXML
    private TextField txtFechain;

    @FXML
    private TextField txtLibro;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void onClickGuardarButton(MouseEvent event) {
        String nombre = txtCliente.getText();
        String libro = txtLibro.getText();
        String fechain = txtFechain.getText();
        String fechafin = txtFechafin.getText();

        Prestamos prestamo = new Prestamos(nombre, libro, fechain, fechafin);

        if (!HelloApplication.getPrestamos().contains(prestamo)) {
            HelloApplication.getPrestamos().add(prestamo);

            mostrarAlerta("Éxito", "Se ha agregado un nuevo prestamo.");

            System.out.println("Nuevo prestamo: ");
            System.out.println("Usuario: "+prestamo.getPersona());
            System.out.println("Libro: "+prestamo.getLibro());
            System.out.println("Fecha de prestamo: "+prestamo.getFechaPrestamo());
            System.out.println("Fecha de devolución: "+prestamo.getFechaDevolucion());
        }
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtCliente.clear();
        txtLibro.clear();
        txtFechain.clear();
        txtFechafin.clear();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

}
