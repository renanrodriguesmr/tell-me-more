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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import tellmemore.Utils;
import tellmemore.model.Resultado;
import tellmemore.model.User;

/**
 * FXML Controller class
 *
 * @author renan
 */
public class ConsultarResultado2Controller implements Initializable {
    
    Resultado resultado;

    @FXML
    Label labelJogadores;
    
    @FXML
    Label labelPerguntas;
    
    @FXML
    private TableView alunosTable ;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }
    
    
    @FXML
    private void voltarMenu(ActionEvent event) throws IOException {
        Utils.loadView("/tellmemore/view/MainMenu.fxml", getClass());
    }
    
    public void setResultado(Resultado resultado){
        this.resultado = resultado;
        System.out.println(resultado.getN_perguntas());
        labelPerguntas.setText("Perguntas: " + this.resultado.getN_perguntas());
        labelJogadores.setText("Jogadores: " + this.resultado.getN_jogadores());
        
        this.createColumn();
        
        for (User user : this.resultado.getJogadores()) {
            alunosTable.getItems().addAll(user);
        }
    }
    
    private void createColumn(){

        TableColumn alunoColumn = new TableColumn("Alunos");
        alunoColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn scoreColumn = new TableColumn("Score");
        scoreColumn.setCellValueFactory(new PropertyValueFactory<>("score"));

        alunosTable.getColumns().addAll(alunoColumn, scoreColumn);
    }
}
