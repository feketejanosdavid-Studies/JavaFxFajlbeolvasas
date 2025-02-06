package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void onClickAboutButton(ActionEvent event) {
        App.setRoot("aboutScene");
    }

    @FXML
    void onClickExitButton(ActionEvent event) {

    }

    @FXML
    void onClickSolutionButton(ActionEvent event) {
        App.setRoot("solutionScene");
    }

    

}
