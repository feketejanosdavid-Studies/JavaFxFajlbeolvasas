package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AboutController {

    @FXML
    void Backbutton(ActionEvent event) throws IOException {
        App.setRoot("mainScene");
    }


}
