package logika;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // XXX:
        int n;
        n = 34;
        byte b;
        short s;
        long l;

        double db;
        float fl;

        boolean bo;

        Integer i2 = new Integer(n);

        // sout
        System.out.println(n);

        String napis;
        napis = "Ala ma kota";

        // napis = n;
        napis = String.valueOf(n);
        napis = "" + n;

        db = Double.parseDouble(napis);

        if (n % 2 == 1) {
            //
        }

        if (n % 2 == 0) {

        } else {
        }

        switch (napis) {
            case "34":
                System.out.println("TO jest ta liczba!");
                break;
            case "44":

                break;

            default:
                throw new AssertionError();
        }

        for (int licznik = 0; licznik < 5; licznik++) {
            System.out.println(licznik);
        }

        n = 12345;
        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
        
        
        do {
            db = Math.random();
            System.out.println(db);
        } while (db < 0.75);
        
        int[] tab = new int[15];
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        
        for (int element : tab) {
            System.out.println(element);
        }
        
        double [][] tab2D;
        tab2D = new double[4][5];
        for (int i = 0; i < tab2D.length; i++) {
            for (int j = 0; j < tab2D[0].length; j++) {
                System.out.print(tab2D[i][j] + "\t");
            }
            System.out.println();
        }
        
        Punkt p = new Punkt();
        System.out.println(p.getX());
        
        System.out.println(p);
        System.out.println(p.toString());
        System.out.println("" + p);
    }

}
