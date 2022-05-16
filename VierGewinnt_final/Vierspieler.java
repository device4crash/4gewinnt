
public class Vierspieler {
  
  // Anfang Attribute
  private String name;
  private int farbe;
  // Ende Attribute
  
  public Vierspieler(String name, int farbe) {
    this.name = name;
    this.farbe = farbe;    
  }

  // Anfang Methoden
  public String getName() {
    return name;
  }

  public void setName(String nameNeu) {
    name = nameNeu;
  }

  public int getFarbe() {
    return farbe;
  }

  public void setFarbe(int farbeNeu) {
    farbe = farbeNeu;
  }

  // Ende Methoden
} // end of Spieler
