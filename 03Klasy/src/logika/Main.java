package logika;

import dane.Punkt;
import dane.Odcinek;
import dane.Mierzalny;
import dane.Lamana;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Odcinek ab = new Odcinek(new Punkt(), new Punkt());
        System.out.println(ab);

        Lamana l = new Lamana();
        l.addElement(ab);
        l.addElement(new Punkt(1, 2));
        l.addElement(new Punkt(2, -7));
        l.addElement(new Punkt(3, 3));
        l.addElement(new Punkt(4, 0));
        System.out.println(l);
        System.out.println(l.length());

        /*  
        Odcinek cd = new Odcinek(4, 5, 7, -2);
        l.addElement(cd);
        System.out.println(l);
        System.out.println(l.length());
         */
        Zadania zadania = new Zadania();
System.out.println(zadania.liczbaPrzeciec(l));

    /*    int liczba;
        long t1s,t1e,t2s,t2e,t3s,t3e;
        
        t1s = System.nanoTime();
        for (int i = 0; i < 100000000; i++) {
            liczba = zadania.liczbaPrzeciec2(l);
        }
        t1e = System.nanoTime();
        
        t2s = System.nanoTime();
        for (int i = 0; i < 100000000; i++) {
            liczba = zadania.liczbaPrzeciec2(l);
        }
        t2e = System.nanoTime();
        
        t3s = System.nanoTime();
        for (int i = 0; i < 100000000; i++) {
            liczba = zadania.liczbaPrzeciec2(l);
        }
        t3e = System.nanoTime();
        
        
        
        System.out.println(t1e-t1s);
        System.out.println(t2e-t2s);
        System.out.println(t3e-t3s);
       */ 
        Mierzalny m = new Lamana();
        
        
        System.out.println(zadania.ileOgrodzen(l, KlasySettings.dostepnaSiatka));
        System.out.println(zadania.ileZostanie(l, KlasySettings.dostepnaSiatka));
    }

}
