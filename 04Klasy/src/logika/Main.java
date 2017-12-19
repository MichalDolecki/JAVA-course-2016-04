package logika;

import dane.Punkt;
import dane.Odcinek;
import dane.Mierzalny;
import dane.Lamana;
import dane.PunktComparator;
import java.util.Arrays;

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
    
        int[] tab = new int[]{4,5,2,1,7,5,4,2,9,7,5};
        for (int liczba : tab) {
            System.out.print(liczba + " ");
        }
        System.out.println();
        Arrays.sort(tab);
        for (int liczba : tab) {
            System.out.print(liczba + " ");
        }
        System.out.println();
        
        Punkt[] tabPunkt = new Punkt[4];
        tabPunkt[0] = new Punkt(5, 10);
        tabPunkt[1] = new Punkt(3, 11);
        tabPunkt[2] = new Punkt(-2, 12);
        tabPunkt[3] = new Punkt(0, 13);
        
        for (Punkt punkt : tabPunkt) {
            System.out.println(punkt);
        }
        Arrays.sort(tabPunkt, new PunktComparator());
        System.out.println("================");
        for (Punkt punkt : tabPunkt) {
            System.out.println(punkt);
        }
    }

}
