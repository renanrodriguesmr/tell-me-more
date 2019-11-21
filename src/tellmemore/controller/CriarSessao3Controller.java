/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellmemore.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import tellmemore.Utils;
import tellmemore.model.User;

/**
 * FXML Controller class
 *
 * @author renan
 */
public class CriarSessao3Controller implements Initializable {
    
    @FXML
    private TableView alunosTable ;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.createColumn();
    }
    
    @FXML
    private void iniciarPartida(ActionEvent event) throws IOException {
        System.out.println("iniciar Partida");
    }
    @FXML
    private void refresh(ActionEvent event) throws IOException {
        User user = new User("John", "OK");
        alunosTable.getItems().addAll(user);
        
    }
    
    private void createColumn(){

        TableColumn alunoColumn = new TableColumn("Alunos");
        alunoColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn statusColumn = new TableColumn("Status");
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        alunosTable.getColumns().addAll(alunoColumn, statusColumn);
    }
    
}
