import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.canvas.*;
import javafx.event.*;
import javafx.application.Application;

public class Vierspielstein extends Button{
  
  // Anfang Attribute
  private char wert;
  private boolean gedrueckt;
  private int spalte;
  private int speicher = 0;
  // Ende Attribute
  
  public Vierspielstein(int spaltennummer){
    spalte = spaltennummer;
    this.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent e){
        Viergewinnt.label1.setText("Es funktioniert!");
        setStyle("-fx-background-color: green");
        Viergewinnt.circle[5-speicher][spalte].setStyle("-fx-background-color: pink");
        speicher++;      
      }    
    });
        
  }  
  // Anfang Methoden
  public char getWert() {
    return wert;
  }
  
  public boolean getGedrueckt() {
    return gedrueckt;
  }
  
  public void setGedrueckt(boolean gedruecktNeu) {
    gedrueckt = gedruecktNeu;
  }
  // Ende Methoden
} // end of Vierspielstein
