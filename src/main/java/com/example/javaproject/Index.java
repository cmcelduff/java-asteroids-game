package com.example.javaproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import java.io.IOException;

public class Index {
    //  loads the FXML file and sets the scene
    public static void load(Stage stage) {
        try {
            Parent root = FXMLLoader.load(Index.class.getResource("index.fxml"));
            stage.getScene().setRoot(root);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
