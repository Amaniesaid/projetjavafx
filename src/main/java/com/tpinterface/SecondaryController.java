package com.tpinterface;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        
    }

    @FXML
    private Button secondaryButton;

    @FXML
    private Button textcolor;

    @FXML
    private Label txtchange;

    /**
     * @param event
     */
    @FXML
    void ChangeTextColor(ActionEvent event) {
        textcolor.setStyle("-fx-text-fill: #FF0000");
        txtchange.setText("Coucou !");
    }


    
}