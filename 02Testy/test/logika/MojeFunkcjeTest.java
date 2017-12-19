/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class MojeFunkcjeTest {

    public MojeFunkcjeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of wyszukaj method, of class MojeFunkcje.
     */
    @Test
    public void testWyszukaj() {
        System.out.println("wyszukaj");
        try {
            int[] tab = null;
            int element = 0;
            MojeFunkcje instance = new MojeFunkcje();
            int expResult = 0;
            int result = instance.wyszukaj(tab, element);
            fail("Tu nie mozemy dotrzeć!!!");
            assertEquals(expResult, result);
        } catch (IllegalArgumentException e) {
            System.out.println("Testowana metoda wyrzuciła wyjątek");
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

        int[] tab2 = new int[]{0, 1, -5, 10, 12};
        int element2 = 0;
        int expResult2 = 0;
        MojeFunkcje instance2 = new MojeFunkcje();
        int result2 = instance2.wyszukaj(tab2, element2);
        assertEquals(expResult2, result2);

        element2 = 1;
        expResult2 = 1;
        result2 = instance2.wyszukaj(tab2, element2);
        assertEquals(expResult2, result2);

        element2 = 12;
        expResult2 = 4;
        result2 = instance2.wyszukaj(tab2, element2);
        assertEquals(expResult2, result2);

        element2 = -12;
        expResult2 = -1;
        result2 = instance2.wyszukaj(tab2, element2);
        assertEquals(expResult2, result2);
    }

    @Test
    public void testMax() {
        System.out.println("maxsymalny");
        try {
            double[] tab = null;
            MojeFunkcje instance = new MojeFunkcje();
            double result = instance.maxymalny(tab);
            fail("Tu nie mozemy dotrzeć!!!");
        } catch (IllegalArgumentException e) {
            System.out.println("Testowana metoda wyrzuciła wyjątek");
        }
        
        double[] tab2 = new double[]{0, 1, -5, 10, 12.0};
        double expResult2 = 12.0;
        MojeFunkcje instance2 = new MojeFunkcje();
        double result2 = instance2.maxymalny(tab2);
        assertEquals(expResult2, result2, 0.00001);
        
        tab2 = new double[]{0, 0, 0, 0, 0.0};
        expResult2 = 0.0;
        result2 = instance2.maxymalny(tab2);
        assertEquals(expResult2, result2, 0.00001);
        
        
        tab2 = new double[]{-17.4};
        expResult2 = -17.4;
        result2 = instance2.maxymalny(tab2);
        assertEquals(expResult2, result2, 0.00001);
    }
}
