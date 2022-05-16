import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.canvas.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.event.*;
import java.beans.EventHandler;


public class Viergewinnt extends Application {
  // Anfang Attribute
  static Vierspiel vg = new Vierspiel();
  static Vierspielstein[][] spielfeld = new Vierspielstein[10][10];
  static Vierspieler spieler1 = new Vierspieler("Kilo", 0);
  static Vierspieler spieler2 = new Vierspieler("Gramm", 0);
  static Circle[][] circle = new Circle[10][10];
  int i = 1;
  static Label label1 = new Label();
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 1177, 733);
    // Anfang Komponenten
    for (int spalte = 0; spalte <= 6; spalte++) {
      spielfeld[0][spalte] = new Vierspielstein(spalte);
      //spielfeld[zeile][spalte] = new Ellipse2D.Float();
      spielfeld[0][spalte].setLayoutX(80+spalte*150);
      spielfeld[0][spalte].setPrefHeight(600);
      spielfeld[0][spalte].setPrefWidth(120);
      spielfeld[0][spalte].setText(i + "");
      //spielfeld[zeile][spalte].setFont(Font.font("Dialog", FontWeight.BOLD, 12));
      root.getChildren().add(spielfeld[0][spalte]);
      spielfeld[0][spalte].setStyle("-fx-background-color: transparent;");
      /*spielfeld[0][spalte].setOnAction((event) -> {
        druecken(event);
      });*/
      //spielfeld[0][spalte].setVisible(true);      
      i++;
    } //end of for
    
    for (int zeile = 0; zeile <= 5; zeile++) {
      for (int spalte = 0; spalte <= 6; spalte++) {
        circle[zeile][spalte] = new Circle();
        circle[zeile][spalte].setLayoutX(140+spalte*150);
        circle[zeile][spalte].setRadius(30);
        circle[zeile][spalte].setCenterY(60+zeile*90);
        root.getChildren().add(circle[zeile][spalte]);
      }
    }
    label1.setLayoutX(41);
    label1.setLayoutY(698);
    label1.setPrefHeight(20);
    label1.setPrefWidth(110);
    label1.setText("text");
    root.getChildren().add(label1);
    // Ende Komponenten
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("Viergewinnt");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of public Viergewinnt
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
  } // end of main
  
  public void druecken(Event evt) {
    for (int spalte = 0;spalte <= 6; spalte++) {
      spielfeld[0][spalte].setOnMouseEntered((event) -> {
        gg(event);
      });
    } // end of for
  }
  
  public void gg(Event evt) {
    for (int spalte = 0; spalte <= 6; spalte++) {
      spielfeld[0][spalte].setVisible(true);
    } // end of for
  }
  
  // Ende Methoden
} // end of class Viergewinnt
