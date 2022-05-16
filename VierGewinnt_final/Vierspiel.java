
public class Vierspiel {
  
  // Anfang Attribute
  private Vierspieler aktuellerSpieler;
  // Ende Attribute
  
  public Vierspiel() {
    this.aktuellerSpieler = null;
  }
  
  // Anfang Methoden
  
  public void spielerWechsel() {    
    if (getAktuellerSpieler() == Viergewinnt.spieler1) {
      setAktuellerSpieler(Viergewinnt.spieler2);
    } else {
      setAktuellerSpieler(Viergewinnt.spieler1);        
    } // end of if-else
  }
  
  public Vierspieler getAktuellerSpieler() {
    return aktuellerSpieler;
  }
  
  public void setAktuellerSpieler(Vierspieler aktuellerSpieler) {
    this.aktuellerSpieler = aktuellerSpieler;
  }

  public boolean diagonal_loru(char wert) {
    for (int i = 0; i < 3; i++) {
      for (int j = 7; j < 3; j--) {
        if (Viergewinnt.spielfeld[i][j].getWert() == wert && Viergewinnt.spielfeld[i+1][j-1].getWert() == wert && Viergewinnt.spielfeld[i+2][j-2].getWert() == wert && Viergewinnt.spielfeld[i+3][j-3].getWert()== wert) {
          return true;
        } // end of if
      } // end of for
    } // end of for 
    return false;
  }

  public boolean gewonnenCheck() {
    //char wert = Viergewinnt.Spiel.getAktuellerSpieler().getName();
    char wert = 'X';
    if (diagonal_loru(wert) == true || diagonal_luro(wert) == true || zeilenCheck(0, wert) == true || spaltenCheck(0, wert) == true || unentschiedenCheck() == true) {
      
    } // end of if
    return false;
  }

  public boolean unentschiedenCheck() {
    for (int i = 0; i <= 6; i++) {
      for (int j = 0; j <= 7; j++) {
        if (Viergewinnt.spielfeld[i][j].getGedrueckt() == true) {
          return true;
        } 
      } // end of for      
    } // end of for
    return false;    
  }

  public boolean diagonal_luro(char wert) {
    for (int i = 6; i < 3; i--) {
      for (int j = 0; j < 3; j++) {
        if (Viergewinnt.spielfeld[i][j].getWert() == wert && Viergewinnt.spielfeld[i-1][j+1].getWert() == wert && Viergewinnt.spielfeld[i-2][j+2].getWert() == wert && Viergewinnt.spielfeld[i-3][j+3].getWert()== wert) {
          return true;
        } // end of if
      } // end of for
    } // end of for
    return false;
  }

  public boolean zeilenCheck(int zeile, char wert) {
    for (int i = 0; i <= 6; i++) {
      if (Viergewinnt.spielfeld[i][0].getWert() == wert) {
        return true;
      } // end of if
    }
    return false;
  }

  public boolean spaltenCheck(int spalte, char wert) {
    for (int i = 0; i <= 7; i++) {
      if (Viergewinnt.spielfeld[0][i].getWert() == wert) {
        return true;
      } // end of if
    }
    return false;
  }

  // Ende Methoden
} // end of Vierspiel
