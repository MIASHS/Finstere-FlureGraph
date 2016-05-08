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
public class Main extends Application {
    private Pane rootLayout;
    private Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Projet");
        ShowMainView();
        
    }
    
    private void ShowMainView() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("FXMLLancement.fxml"));
        rootLayout = (Pane) loader.load();
        Scene scene = new Scene(rootLayout);
        primaryStage.getScene();
        primaryStage.show();
        
    } 
    
  //  public static void goSelectionJ(){
  //      FXMLLoader loader = new FXMLLoader();
  //      loader.setLocation(Main.class.getResource("FXMLselectionNbJoueur.fxml"));
   //     BorderPane goselectj = loader.load();
        
  //  }
   
    
   // public static void showPageSelectNbJoueur() throws IOException{
    //    FXMLLoader loader = new FXMLLoader();
    //    loader.setLocation(Main.class.getResource("FXMLselectionNbJoueur.fxml"));
     //   BorderPane selectNbJoueur = loader.load();
    //    rootLayout.setCenter(selectNbJoueur);
    
   // }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
