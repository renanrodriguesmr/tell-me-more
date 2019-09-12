/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellmemore.professor;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import tellmemore.TellMeMore;

/**
 *
 * @author renan
 */
public class UtilsProfessor {
    /**
    * Router keeping title
    * 
    * @author renan
    */
    @FXML
    public static void loadView(String absoluteName, Class<?> className) {
        try {
            //TODO: alterar elementos da router, de acordo com o que for escolhido para o Aluno
            FXMLLoader loader = new FXMLLoader(className.getResource(absoluteName));
            AnchorPane newAnchorPane = loader.load();
            
            Scene mainScene = TellMeMore.getMainScene();
            AnchorPane mainAnchorPane;
            mainAnchorPane = (AnchorPane) ((TitledPane) mainScene.getRoot()).getContent();
            mainAnchorPane.getChildren().clear();
            mainAnchorPane.getChildren().addAll(newAnchorPane.getChildren());
            
            
        } catch (IOException e) {
            //TODO: EXIBIR ALERTA PARA UM CASO DE ERRO
            System.out.println(e.getMessage());
        }
    }
}
