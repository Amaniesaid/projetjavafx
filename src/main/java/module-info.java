module com.tpinterface {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tpinterface to javafx.fxml;
    exports com.tpinterface;
}
