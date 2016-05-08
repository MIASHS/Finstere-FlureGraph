/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtest;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Gaby
 */
public class JavaFXtest extends Application {
    private BorderPane mainLayout;
    
    @Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("FXMLLancement.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
   
    
   // public static void showPageSelectNbJoueur() throws IOException{
    //    FXMLLoader loader = new FXMLLoader();
    //    loader.setLocation(JavaFXtest.class.getResource("FXMLselectionNbJoueur.fxml"));
     //   BorderPane selectNbJoueur = loader.load();
    //    mainLayout.setCenter(selectNbJoueur);
    
   // }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
