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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import tellmemore.Utils;

/**
 * FXML Controller class
 *
 * @author renan
 */
public class AdicionarQuestaoController implements Initializable {
    
    @FXML
    private ChoiceBox choiceTema ;
    
    @FXML
    private TextField enunciadoInput;
    
    @FXML
    private TextField respostaInput;
    
    @FXML
    Spinner dificuldadeSpinner;

     String[] listaTemas;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.listaTemas = new String[]  {"tema 1", "tema 2", "tema 3", "tema 4", "tema 5"};
        
        for (String tema : listaTemas) {
            choiceTema.getItems().add(tema);
        }
        
        dificuldadeSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 3));
    }
    
    @FXML
    private void addQuestao(ActionEvent event) throws IOException {
        
        String tema = (String) choiceTema.getValue();
        String enunciado = (String) enunciadoInput.getText();        
        String resposta = (String) respostaInput.getText();
        int dificuldade = (int) dificuldadeSpinner.getValue();

        Utils.loadView("/tellmemore/view/AdicionarQuestao2.fxml", getClass());
          
        
    }
    
}
