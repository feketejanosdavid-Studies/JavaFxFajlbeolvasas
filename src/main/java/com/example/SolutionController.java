package com.example;

import java.time.LocalDate;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class SolutionController {

    @FXML
    void Backbutton(ActionEvent event) {
        App.setRoot("mainScene");
    }

    @FXML
    void initialize() {
        System.out.println("működik he more");
        Handler handler = new Handler();
        termesLista = handler.ReadFile();
        // for(Termes termes : termesLista) {
        //     System.out.println(termes.nev);
        // }
        this.InitCol();
    }

    @FXML
    private TableColumn<Termes, LocalDate> betakaritascol;

    @FXML
    private TableColumn<Termes, String> dulocol;

    @FXML
    private TableColumn<Termes, Integer> idcol;

    @FXML
    private TableColumn<Termes, Integer> mennyisegcol;

    @FXML
    private TableColumn<Termes, String> nevcol;

    @FXML
    private TableView<Termes> table;

    ArrayList<Termes> termesLista;

    void InitCol() {
        this.idcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.nevcol.setCellValueFactory(new PropertyValueFactory<>("nev"));
        this.dulocol.setCellValueFactory(new PropertyValueFactory<>("dulo"));
        this.mennyisegcol.setCellValueFactory(new PropertyValueFactory<>("mennyiseg"));
        this.betakaritascol.setCellValueFactory(new PropertyValueFactory<>("betakaritas"));

        ObservableList<Termes> observableList = FXCollections.observableArrayList(termesLista);
        this.table.getItems().addAll(observableList);
    }

    @FXML
    void tableclicked(MouseEvent event) {
        Termes termes = this.table.getSelectionModel().getSelectedItem();
        System.out.println(termes.id);
    }

}
