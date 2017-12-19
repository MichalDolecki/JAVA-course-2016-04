package logika;

import dane.Odcinek;
import dane.Mierzalny;
import dane.Lamana;

/**
 *
 * @author Student
 */
public class Zadania {

    public int ileOgrodzen(Mierzalny m, double siatka) {
        return (int) (siatka / m.length());
    }

    public double ileZostanie(Mierzalny m, double siatka) {
        return siatka - ileOgrodzen(m, siatka) * m.length();
    }

    public int liczbaPrzeciec(Lamana lamana) {
        int w = 0;
        Odcinek[] odcinki = lamana.getLamana();
        for (Odcinek odcinek : odcinki) {
            if (odcinek.getA().getY() * odcinek.getB().getY() < 0) {
                w++;
            }
        }
        return w;
    }

    public int liczbaPrzeciec2(Lamana lamana) {
        int w = 0;
        Odcinek[] odcinki = lamana.getLamana();
        for (Odcinek odcinek : odcinki) {
            if ((int) (Math.signum(odcinek.getA().getY()))
                    * (int) (Math.signum(odcinek.getB().getY())) < 0) {
                w++;
            }
        }
        return w;
    }

    public int liczbaPrzeciec3(Lamana lamana) {
        int w = 0;
        Odcinek[] odcinki = lamana.getLamana();
        for (Odcinek odcinek : odcinki) {
            if ((odcinek.getA().getY() > 0 && odcinek.getB().getY() < 0)
                    || (odcinek.getA().getY() < 0 && odcinek.getB().getY() > 0)) {
                w++;
            }
        }
        return w;
    }

    /*public int liczbaPrzeciec4(Lamana lamana){
        int w = 0;
        Odcinek[] odcinki= lamana.getLamana();
        for (Odcinek odcinek : odcinki) {
            if (Double.doubleToLongBits(odcinek.getA().getY())>>>31 * odcinek.getB().getY() < 0) {
                w++;
            }
        }
        return w;
    }*/
}
