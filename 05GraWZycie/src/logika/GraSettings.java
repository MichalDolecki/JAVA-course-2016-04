package logika;

/**
 *
 * @author Michał Dolecki <>
 */
public class GraSettings {
    /**
     * Liczba wierszy w siatce.
     */
    public static int WYSOKOSC = 5;
    /**
     * Liczba kolumn w siatce.
     */
    public static int SZEROKOSC = 5;
    /**
     * Warunek na ożycie komórki.
     */
    public static int[] OZYCIE = new int[]{3};
    /**
     * Warunek na przeżycie komórki.
     */
    public static int[] PRZEZYCIE = new int[]{2,3};
    /**
     * Symbole do reprezentowania komórek w różnych stanach.
     */
    public static String[] SYMBOLE = new String[]{" ","X"};
}
