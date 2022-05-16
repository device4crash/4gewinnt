import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.canvas.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.event.*;
import javafx.application.Application;

public class Vierspielspalte extends Button{
  
  // Anfang Attribute
  private char wert;
  private boolean gedrueckt;
  private int spalte;
  private int speicher = 0;
  // Ende Attribute
  
  public Vierspielspalte(int spaltennummer){
    spalte = spaltennummer;
    this.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent e){
        Viergewinnt.label1.setText("Es funktioniert!");
        setStyle("-fx-background-color: green");
        if (speicher <= 5) {
          if (Viergewinnt.vs.getAktuellerSpieler() == Viergewinnt.spieler1) {
            Viergewinnt.circle[5-speicher][spalte].setFill(Color.YELLOW);
          } else {
            Viergewinnt.circle[5-speicher][spalte].setFill(Color.RED);  
          } // end of if-else
        } // end of if        
        Viergewinnt.vs.spielerWechsel();
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
