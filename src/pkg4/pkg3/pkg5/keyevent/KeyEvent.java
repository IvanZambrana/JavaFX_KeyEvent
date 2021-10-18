/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg3.pkg5.keyevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author ivan
 */
public class KeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Tittle
        primaryStage.setTitle("KeyEvent");
        
        //Text
        Text text = new Text(20,20,"A");
        text.setFocusTraversable(true);
        //KeyEvent
        text.setOnKeyPressed( e ->{
            switch (e.getCode()) {
                case UP:
                    text.setY(text.getY() - 10);
                    break;
                case DOWN:
                    text.setY(text.getY() + 10);
                    break;
                case LEFT:
                    text.setX(text.getX() - 10);
                    break;
                case RIGHT:
                    text.setX(text.getX() + 10);
                    break;
                default:
                    text.setText(text.getText() + e.getCode());
                    break;
            }
        });
        
        //Pane
        Pane root = new Pane();
        
        root.getChildren().add(text);     
        
        
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
