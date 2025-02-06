package com.example;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SolutionController {

    @FXML
    void Backbutton(ActionEvent event) {
        App.setRoot("mainScene");
    }

    @FXML
    void initialize() {
        System.out.println("működik he more");
        Handler handler = new Handler();
        ArrayList<Termes> termesLista = handler.ReadFile();
        for(Termes termes : termesLista) {
            System.out.println(termes.nev);
        }
    }

}
