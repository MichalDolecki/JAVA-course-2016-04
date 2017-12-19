/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika;

import dane.Punkt;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class PunktTest {
    
    public PunktTest() {
    }

    @Test
    public void testDistance_0args() {
        System.out.println("distance");
        Punkt instance = new Punkt();
        double expResult = 0.0;
        double result = instance.distance();
        assertEquals(expResult, result, 0.0);
        
        instance.setX(1);
        instance.setY(1);
        expResult = Math.sqrt(2);
        result = instance.distance();
        assertEquals(expResult, result, 0.0000001);
    }

    @Test
    public void testDistance_Punkt() {
        System.out.println("distance");
        Punkt p = null;
        Punkt instance = new Punkt();
        double expResult = 0.0;
        double result;
        try {
            result = instance.distance(p);
            fail("Nie ma wyjątku!!!");
        } catch (Exception e) {
            System.out.println("Przechwycono wyjątek!!!");
        }
        
        p = new Punkt(0, 0);
        instance = new Punkt(1, 1);
        expResult = Math.sqrt(2);
        result = instance.distance(p);
        assertEquals(expResult, result, 0.0001);
        
        p = new Punkt(1, 1);
        instance = new Punkt(4, 5);
        expResult = 5.0;
        result = instance.distance(p);
        assertEquals(expResult, result, 0.0001);
    }
    
}
