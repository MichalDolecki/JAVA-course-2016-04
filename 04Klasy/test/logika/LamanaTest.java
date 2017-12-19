package logika;

import dane.Punkt;
import dane.Odcinek;
import dane.Lamana;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class LamanaTest {

    public LamanaTest() {
    }

    @Test
    public void testAddElement_Odcinek() {
        System.out.println("addElement");
        Odcinek o = new Odcinek(0, 0, 10, 12);
        Lamana instance = new Lamana();
        instance.addElement(o);

        o = new Odcinek(10, 12, 5, 7);
        instance.addElement(o);

        try {
            o = new Odcinek(10, 12, 5, 7);
            instance.addElement(o);
            fail("Tu nie dotrzemy!!!");
        } catch (IllegalArgumentException e) {
            System.out.println("Przechwycono wyjątek!!!");
        }
    }

    @Test
    public void testAddElement_Punkt() {
        System.out.println("addElement");
        Punkt p = new Punkt(10, 10);
        Lamana instance = new Lamana();
        try {
            instance.addElement(p);
            fail("Wyjątek nie działa!!!");
        } catch (Exception e) {
            System.out.println("Przechwycono wyjątek!!!");
        }

        instance.addElement(new Odcinek(0, 0, 1, 1));
        instance.addElement(p);

    }

    @Test
    public void testGetPoczatek() {
        System.out.println("getPoczatek");
        Lamana instance = new Lamana();
        Punkt expResult = null;
        Punkt result = instance.getPoczatek();
        assertNull(result);

        Odcinek o = new Odcinek(1, 1, 0, 0);
        instance.addElement(o);
        expResult = new Punkt(1, 1);
        result = instance.getPoczatek();
//        assertEquals(expResult.getX(), result.getX(),0.0001);
//        assertEquals(expResult.getY(), result.getY(),0.0001);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetKoniec() {
        System.out.println("getKoniec");
        Lamana instance = new Lamana();
        Punkt expResult = null;
        Punkt result = instance.getKoniec();
        assertNull(result);

        Odcinek o = new Odcinek(1, 1, 0, 0);
        instance.addElement(o);
        expResult = new Punkt(0, 0);
        result = instance.getKoniec();
        assertEquals(expResult, result);
    }

    @Test
    public void testLength() {
        System.out.println("length");
        Lamana instance = new Lamana();
        double expResult = 0.0;
        double result = instance.length();
        assertEquals(expResult, result, 0.00001);
        
        instance.addElement(new Odcinek(0, 0, 1, 1));
        expResult = Math.sqrt(2);
        result = instance.length();
        assertEquals(expResult, result, 0.00001);
    }

}
