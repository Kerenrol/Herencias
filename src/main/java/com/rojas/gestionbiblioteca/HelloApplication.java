package com.rojas.gestionbiblioteca;

import com.rojas.gestionbiblioteca.models.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;


import java.io.IOException;
import java.util.ArrayList;


public class HelloApplication extends javafx.application.Application {
    private static Stage stageView;
    private static Stage stageRoot;
    private static Libros libro = new Libros();
    private static Prestamos prestamo = new Prestamos();
    private static ObservableList<Prestamos> prestamos = FXCollections.observableArrayList();
    private static ObservableList<Libros> libros = FXCollections.observableArrayList();
    private static Persona persona = new Persona();
    private static ArrayList<Alumnos> listaAlumnos = new ArrayList<>();

    private static ArrayList<Profesores> listaProfesores = new ArrayList<>();
    public static void agregarAlumno(Alumnos alumno) {
        listaAlumnos.add(alumno);
    }

    public static void agregarProfesor(Profesores profesor) {
        listaProfesores.add(profesor);
    }

    public static ArrayList<Alumnos> getListaAlumnos() {
        return listaAlumnos;
    }

    public  static ArrayList<Profesores> getListaProfesores() {
        return listaProfesores;
    }

    public static Persona getPersona() {
        return persona;
    }

    @Override
    public void start(Stage stage) throws IOException {
        stageRoot = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("NameApplication - Home");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void newStage(String fxml, String title) {
        stageView = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(loadFXML(fxml));
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            stageView.setTitle(title);
            stageView.setScene(scene);
            stageView.centerOnScreen();
            stageView.initOwner(stageRoot);
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static Stage getStageView(){
        return stageView;
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static Libros getLibro() {
        return libro;
    }
    public static ObservableList<Libros> getLibros() {
        return libros;
    }

    public static Prestamos getPrestamo() {
        return prestamo;
    }

    public static ObservableList<Prestamos> getPrestamos() {
        return prestamos;
    }

    public static void main(String[] args) {
        launch();
    }
}
