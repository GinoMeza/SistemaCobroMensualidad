module org.sistemacobromensualidad {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.sistemacobromensualidad to javafx.fxml;
    exports org.sistemacobromensualidad;
}
