package logika;

import dane.Siatka;

/**
 *
 * @author Michał Dolecki <>
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Siatka gra1 = new Siatka(GraSettings.WYSOKOSC, GraSettings.SZEROKOSC);
    gra1.losuj();
    System.out.println(gra1);
  }

}
