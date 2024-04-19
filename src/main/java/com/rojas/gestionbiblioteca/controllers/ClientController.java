package com.rojas.gestionbiblioteca.controllers;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import com.rojas.gestionbiblioteca.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ClientController {

    @FXML
    private BottomNavigationButton alumnoBtn;

    @FXML
    private BottomNavigationButton profesorBtn;

    @FXML
    private Button salirBtn;

    @FXML
    void OnMouseClickAlumnoBtn(MouseEvent event) {
        HelloApplication.newStage("agregarAlumno-view", "App - SaveClassmate");
    }

    @FXML
    void OnMouseClickProfesorBtn(MouseEvent event) {
        HelloApplication.newStage("agregarProfesor-view", "App - SaveTeacher");
    }

    @FXML
    void OnMouseClickSalirBtn(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

}
