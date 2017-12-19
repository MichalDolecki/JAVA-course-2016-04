/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dane;

import java.util.Comparator;

/**
 *
 * @author Michał Dolecki <>
 */
public class PunktComparator implements Comparator<Punkt>{

    @Override
    public int compare(Punkt t1, Punkt t2) {
        if (t1.getX() > t2.getX()) {
            return 1;                
        }
        if (t1.getX() < t2.getX()) {
            return -1;
        } 
        return 0;    
    }

}
