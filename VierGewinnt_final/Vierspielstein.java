import javafx.scene.shape.Circle;

public class Vierspielstein extends Circle{
  
  // Anfang Attribute
  private String farbe;
  private Vierspieler spielerA;
  // Ende Attribute
  
  // Anfang Methoden
  public String getFarbe() {
    return farbe;
  }

  public void setFarbe(String farbeNeu) {
    farbe = farbeNeu;
  }
  // Ende Methoden
} // end of Vierspielstein
