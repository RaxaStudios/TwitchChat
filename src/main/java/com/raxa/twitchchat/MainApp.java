package com.raxa.twitchchat;

import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        Path file = Paths.get("com/raxa/fxml/Scene.fxml");
            //Path fileResolved = file.resolve("Scene.fxml");
        try{
        FXMLLoader loadFXML = new FXMLLoader();
        System.out.println(file.toString());
            loadFXML.setLocation(getClass().getClassLoader().getResource("Scene.fxml"));
            
            Parent root = (Parent) loadFXML.load();
        
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("Styles.css");
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
