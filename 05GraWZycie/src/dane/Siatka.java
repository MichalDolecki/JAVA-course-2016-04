package dane;

import logika.GraSettings;

/**
 *
 * @author Michał Dolecki <>
 */
public class Siatka {

  private int[][] pola;
  private int wysokosc, szerokosc;

  public Siatka(int wysokosc, int szerokosc) {
    this.wysokosc = wysokosc;
    this.szerokosc = szerokosc;
    pola = new int[wysokosc][szerokosc];
  }

  public void losuj() {
    /*for (int i = 0; i < wysokosc; i++) {
     for (int j = 0; j < szerokosc; j++) {
     pola[i][j] = Math.random() < 0.5 ? 1 : 0;
     }
     }
     */
    losuj(0.5);
  }

  public void losuj(double p) {
    for (int i = 0; i < wysokosc; i++) {
      for (int j = 0; j < szerokosc; j++) {
        pola[i][j] = Math.random() < p ? 1 : 0;
      }
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < wysokosc; i++) {
      for (int j = 0; j < szerokosc; j++) {
        /*if(pola[i][j]==1){
         sb.append(GraSettings.SYMBOLE[1]);
         } else {
         sb.append(GraSettings.SYMBOLE[0]);
         }
         */
        sb.append(GraSettings.SYMBOLE[pola[i][j]]);
      }
      sb.append("\n");
    }
    return sb.toString();
  }

}
