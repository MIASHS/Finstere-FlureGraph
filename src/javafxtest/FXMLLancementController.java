/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtest;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafxtest.JavaFXtest;

/**
 * FXML Controller class
 *
 * @author Gaby
 */
public class FXMLLancementController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private JavaFXtest main;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void bttest (ActionEvent event){
        System.out.println("j'aime putain");
    }
    
    
    
   // @FXML 
//    private void goPageSelectNbJoueur() throws IOException{
  //      JavaFXtest.showPageSelectNbJoueur();
    
  //  }
}
 