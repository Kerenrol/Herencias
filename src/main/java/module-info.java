module com.rojas.gestionbiblioteca {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.attach.display;
    requires com.gluonhq.charm.glisten;
    requires java.desktop;

    opens com.rojas.gestionbiblioteca to javafx.fxml;
    exports com.rojas.gestionbiblioteca;
    exports com.rojas.gestionbiblioteca.controllers;
    opens com.rojas.gestionbiblioteca.controllers to javafx.fxml;
}