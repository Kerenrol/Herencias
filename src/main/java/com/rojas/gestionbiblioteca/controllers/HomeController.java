package com.rojas.gestionbiblioteca.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.rojas.gestionbiblioteca.HelloApplication;
import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import com.rojas.gestionbiblioteca.models.Alumnos;
import com.rojas.gestionbiblioteca.models.Libros;
import com.rojas.gestionbiblioteca.models.Profesores;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class HomeController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button exitButton;

    @FXML
    private BottomNavigationButton prestamosButton;

    @FXML
    private BottomNavigationButton bookButton;

    @FXML
    private BottomNavigationButton clientButton;

    @FXML
    private BottomNavigationButton bookViewBtn;

    @FXML
    void onClickBookViewBtn(MouseEvent event) {
        HelloApplication.newStage("bookView-view", "App - Book View");
    }

    @FXML
    void onMouseClickExitButton(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void onClickClientButton(MouseEvent event) {
        HelloApplication.newStage("client-view", "App - View Client");
    }

    @FXML
    void onClickBookButton(MouseEvent event) {
        HelloApplication.newStage("book-view", "App - View Book");
    }

    @FXML
    void onClickPrestamoButton(MouseEvent event) {
        HelloApplication.newStage("prestamo-view", "App - View Prestamo");
    }

    @FXML
    void initialize() {
        exitButton.getStyleClass().setAll("btn","btn-gl","btn-success");
        exitButton.setStyle("-fx-font-size: 20px; -fx-font-weight: 900; -fx-alignment: center;");
    }
}
