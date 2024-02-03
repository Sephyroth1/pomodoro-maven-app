package app.pomodoro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import java.lang.Integer;
import java.lang.Exception;


public class Main extends Application {
    @FXML
    private TextField input1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            Parent loader = FXMLLoader.load(getClass().getResource("/app/pomodoro/hello.fxml"));
            Scene sc = new Scene(loader, 600, 600);
            primaryStage.setScene(sc);
            primaryStage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }

    @FXML
    private void Add(ActionEvent e) throws Exception {
        String s = input1.getText();
        try{
            int num1 = Integer.parseInt(s);
            input1.setText("");
            
        }
        catch(NumberFormatException f){
            System.out.println("Enter a number please ");
        }
    }
}
