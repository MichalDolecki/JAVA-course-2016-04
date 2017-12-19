package dane;

import dane.Lamana;

/**
 *
 * @author Student
 */
public class LamanaZamknieta extends Lamana{

    @Override
    public double length() {
        if (lista.size() < 2) {
            return super.length();
        }
        return super.length() + getPoczatek().distance(getKoniec()); 
    
        /*
        double domkniecie = 0.0;
        if (lista.size() > 1) {
            domkniecie = getPoczatek().distance(getKoniec());
        }
        return super.length() + domkniecie;
        */
    }
    
}
