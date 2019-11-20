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
public class AdicionarQuestao2Controller implements Initializable {

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
    
}
