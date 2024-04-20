package com.rojas.gestionbiblioteca.controllers;

import com.rojas.gestionbiblioteca.HelloApplication;
import com.rojas.gestionbiblioteca.models.Libros;
import com.rojas.gestionbiblioteca.models.ListaDeseos;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ListaDeseosController {

    @FXML
    private Button closeButton;

    @FXML
    private Button guardarButton;

    @FXML
    private TextField txtAutor;

    @FXML
    private TextField txtEditorial;

    @FXML
    private TextField txtNombre;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void onClickGuardarButton(MouseEvent event) {
        String titulo = this.txtNombre.getText();
        String autor = this.txtAutor.getText();
        String editorial = this.txtEditorial.getText();

        ListaDeseos deseo = new ListaDeseos(titulo, autor, editorial);
        if (!HelloApplication.getListaDeseos().contains(deseo)) {
            HelloApplication.getListaDeseos().add(deseo);

            mostrarAlerta("Éxito", "Se ha agregado un nuevo libro a la lista de deseos.");

            System.out.println("Se agregó el libro: ");
            System.out.println("Título: "+titulo);
            System.out.println("Autor: "+autor);
            System.out.println("Editorial: "+editorial);
        }
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNombre.clear();
        txtAutor.clear();
        txtEditorial.clear();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

}
