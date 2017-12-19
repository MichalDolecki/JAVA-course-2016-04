package logika;

/**
 *
 * @author Student
 */
public class MojeFunkcje {

    public int wyszukaj(int[] tab, int element) {
        if (tab == null) {
            throw new IllegalArgumentException("Tablica jest nullem!");
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public double maxymalny(double[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Tablica jest nullem!");
        }
        double w = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > w) {
                w = tab[i];
            }
        }
        return w;
    }

}
