import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.paint.Color;


public class test extends Application {
  // Anfang Attribute
  static Circle circle1 = new Circle();
  private Button button1 = new Button();
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 284, 262);
    // Anfang Komponenten
    
    circle1.setCenterX(120);
    circle1.setCenterY(160);
    circle1.setRadius(50);
    circle1.setFill(Color.BLUE);
    root.getChildren().add(circle1);
    button1.setLayoutX(82);
    button1.setLayoutY(60);
    button1.setPrefHeight(25);
    button1.setPrefWidth(75);
    button1.setOnAction(
      (event) -> {button1_Action(event);} 
    );
    root.getChildren().add(button1);
    // Ende Komponenten
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("test");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of public test
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
  } // end of main
  
  public void button1_Action(Event evt) {
    circle1.setFill(Color.BLACK);
    
  } // end of button1_Action

  // Ende Methoden
} // end of class test

