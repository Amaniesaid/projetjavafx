module com.tpinterface {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.tpinterface to javafx.fxml;
    exports com.tpinterface;
}
