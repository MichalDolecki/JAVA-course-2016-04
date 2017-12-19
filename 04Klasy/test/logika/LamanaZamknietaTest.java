/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika;

import dane.Odcinek;
import dane.LamanaZamknieta;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class LamanaZamknietaTest {

    public LamanaZamknietaTest() {
    }

    @Test
    public void testSomeMethod() {
        LamanaZamknieta instance = new LamanaZamknieta();
        double expResult = 0.0;
        double result = instance.length();
        assertEquals(expResult, result, 0.00001);

        Odcinek ab = new Odcinek(0, 0, 1, 1);
        instance.addElement(ab);
        expResult = Math.sqrt(2);
        result = instance.length();
        assertEquals(expResult, result, 0.00001);

        ab = new Odcinek(1, 1, 0, 2);
        instance.addElement(ab);
        expResult = Math.sqrt(2) * 2 + 2;
        result = instance.length();
        assertEquals(expResult, result, 0.00001);
    }

}
