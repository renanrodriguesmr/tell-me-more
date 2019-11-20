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
import javafx.scene.control.ListView;
import javafx.scene.control.SplitMenuButton;
import tellmemore.Utils;

/**
 * FXML Controller class
 *
 * @author renan
 */
public class CriarSessao2Controller implements Initializable {
    
    String tema;
    int session_id;
    
    @FXML
    private Label mensagem ;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    @FXML
    private void confirmarSessao(ActionEvent event) throws IOException {
        System.out.println(this.session_id);
        Utils.loadView("/tellmemore/view/CriarSessao3.fxml", getClass());
    }
    
    public void setTema(String tema){
        this.tema = tema;
    }
    
    public void setSessionID(int id) {
        this.session_id = id;
        mensagem.setText("O código da sessão é: " + this.session_id);
    }
    
}
