package com.rojas.gestionbiblioteca.controllers;

import com.rojas.gestionbiblioteca.HelloApplication;
import com.rojas.gestionbiblioteca.models.ListaDeseos;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class VerDeseosController implements Initializable {

    @FXML
    private TableColumn<ListaDeseos, String> autorColumn;

    @FXML
    private TableColumn<ListaDeseos, String> editorialColumn;

    @FXML
    private TableView<ListaDeseos> tabla;

    @FXML
    private TableColumn<ListaDeseos, String> tituloColumn;

    @FXML
    void OnMouseClickedSalirBtn(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.tituloColumn.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        this.autorColumn.setCellValueFactory(new PropertyValueFactory<>("autor"));
        this.editorialColumn.setCellValueFactory(new PropertyValueFactory<>("editorial"));

        this.tabla.setItems(HelloApplication.getListaDeseos());
    }
}
