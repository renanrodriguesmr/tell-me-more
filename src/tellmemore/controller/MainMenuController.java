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
import tellmemore.Utils;

/**
 * FXML Controller class
 *
 * @author renan
 */
public class MainMenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
            
    @FXML
    private void goToCriarSessao(ActionEvent event) throws IOException {
        Utils.loadView("/tellmemore/view/CriarSessao.fxml", getClass());
    }
    
    @FXML
    private void goToAddQuestao(ActionEvent event) throws IOException {
        Utils.loadView("/tellmemore/view/AdicionarQuestao.fxml", getClass());
    }
    
    @FXML
    private void goToConsultaResultado(ActionEvent event) throws IOException {
        Utils.loadView("/tellmemore/view/ConsultarResultado.fxml", getClass());
    }
    
    
}
