/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellmemore.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import tellmemore.TellMeMore;
import tellmemore.Utils;

/**
 * FXML Controller class
 *
 * @author renan
 */
public class CriarSessaoController implements Initializable {
    
    String[] listaTemas;
    
    @FXML
    private SplitMenuButton splitMenuButton ;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.listaTemas = new String[]  {"tema 1", "tema 2", "tema 3", "tema 4", "tema 5"};
        
        for (String tema : listaTemas) {
            MenuItem choice = new MenuItem(tema);
            splitMenuButton.getItems().add(choice);
            choice.setOnAction((e)-> {
                splitMenuButton.setText(tema);
            });
        }
    }
    
    @FXML
    private void confirmarTema(ActionEvent event) throws IOException {
        
        String tema = splitMenuButton.getText();
        int session_id = 1201;
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/tellmemore/view/CriarSessao2.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        CriarSessao2Controller ctrl = fxmlLoader.<CriarSessao2Controller>getController();
        ctrl.setTema(tema);
        ctrl.setSessionID(session_id);
        TellMeMore.setMainScene(root);
        
    }
    
}
