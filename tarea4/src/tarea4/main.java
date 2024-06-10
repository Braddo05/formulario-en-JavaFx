package tarea4;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) {
        //controles
        Button bt = new Button("No presionar");
        
        CheckBox checkb = new CheckBox();
        
        Hyperlink hyperlink = new Hyperlink("Tarea de menú");
        hyperlink.setOnAction(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com"));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        });
        
        ToggleButton toggleButton = new ToggleButton("ToggleButton");
        
        RadioButton radioButton = new RadioButton("si");
        RadioButton radioButton2 = new RadioButton("no");
        
        Label lbl = new Label("Hola");
        
        Label lbl2= new Label ("0 \t \t \t \t \t \t \t \t \t 5 \t \t \t \t \t \t \t \t \t 10");
        
        Button guardarbt = new Button("Guardar");
        
        TextField textF = new TextField("pedritoelpro");
        
        PasswordField passwordf = new PasswordField();
        passwordf.setText("password");
        
        TextArea textArea = new TextArea("El que se mueva es licenciado...");
        
        ProgressIndicator progressIndicator = new ProgressIndicator(0.49);
        ProgressBar progressBar = new ProgressBar(0.49);
        
        Slider slider = new Slider();

       
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(10);
  
        gridPane.add(new Label("Button:"), 0, 0);
        gridPane.add(bt, 1, 0);
        gridPane.add(new Label("Vale todo?"), 0, 1);
        gridPane.add(checkb, 1, 1);
        gridPane.add(new Label("link de github:"), 0, 2);
        gridPane.add(hyperlink, 1, 2);
        gridPane.add(new Label("ToggleButton:"), 0, 3);
        gridPane.add(toggleButton, 1, 3);
        gridPane.add(new Label("Conf si vale?"), 0, 4);
        gridPane.add(radioButton, 1, 4);
        gridPane.add(radioButton2, 1, 4);
        GridPane.setHalignment(radioButton2, HPos.CENTER);
        gridPane.add(new Label("Label:"), 0, 5);
        gridPane.add(lbl, 1, 5);
        gridPane.add(new Label("Usuario:"), 0, 6);
        gridPane.add(textF, 1, 6);
        gridPane.add(new Label("Password:"), 0, 7);
        gridPane.add(passwordf, 1, 7);
        gridPane.add(new Label("Comentarios:"), 0, 8);
        gridPane.add(textArea, 1, 8);
        gridPane.add(new Label("ProgressIndicator:"), 0, 9);
        gridPane.add(progressIndicator, 1, 9);
        gridPane.add(new Label("ProgressBar:"), 0, 10);
        gridPane.add(progressBar, 1, 10);
        gridPane.add(new Label("Que tan bien está?"), 0, 11);
        gridPane.add(slider, 1, 11);
        gridPane.add(new Label("Puntuacion"), 0, 12);
        gridPane.add(lbl2, 1, 12);
        gridPane.add(guardarbt, 1, 13);
        GridPane.setHalignment(guardarbt, HPos.CENTER);

        // Crear la escena y establecer el escenario
        Scene scene = new Scene(gridPane, 700, 600);
        primaryStage.setTitle("Formulario");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}