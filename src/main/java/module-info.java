module com.example.client_lab6 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.client_lab6 to javafx.fxml;
    exports com.example.client_lab6;
}