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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import tellmemore.TellMeMore;
import tellmemore.Utils;
import tellmemore.model.Resultado;
import tellmemore.model.User;

/**
 * FXML Controller class
 *
 * @author renan
 */
public class ConsultarResultadoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void goToResultado(ActionEvent event) throws IOException {
        
        User user1 = new User("Aluno 1", "ok", 30);
        User user2 = new User("Aluno 2", "ok", 30);
        User user3 = new User("Aluno 3", "ok", 40);
        
        User[] jogadores = {user1, user2, user3};
        int n_perguntas = 10;
        int n_jogadores = jogadores.length;
        
        Resultado resultado = new Resultado(n_perguntas, n_jogadores, jogadores);
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/tellmemore/view/ConsultarResultado2.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        ConsultarResultado2Controller ctrl = fxmlLoader.<ConsultarResultado2Controller>getController();
        ctrl.setResultado(resultado);
        TellMeMore.setMainScene(root);
    }
}
