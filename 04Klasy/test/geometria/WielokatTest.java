/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import dane.Lamana;
import dane.Punkt;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michał Dolecki <>
 */
public class WielokatTest {

    public WielokatTest() {
    }

    @Test
    public void testPole() {
        System.out.println("Pole");
        Wielokat w = new Wielokat(4);
        w.addPunkt(new Punkt());
        w.addPunkt(new Punkt(1, 0));
        w.addPunkt(new Punkt(1, 1));
        w.addPunkt(new Punkt(0, 1));

        System.out.println(w.Pole());
        assertEquals(1, w.Pole(), 0.000001);

        w = new Wielokat(4);
        w.addPunkt(new Punkt(3, 3));
        w.addPunkt(new Punkt(4, 3));
        w.addPunkt(new Punkt(4, 4));
        w.addPunkt(new Punkt(3, 4));

        System.out.println(w.Pole());
        assertEquals(1, w.Pole(), 0.1);

        w = new Wielokat(4);
        w.addPunkt(new Punkt(3, 3));
        w.addPunkt(new Punkt(4, 3));
        w.addPunkt(new Punkt(4, 4));
        try {
            assertEquals(1, w.Pole(), 0.000001);
            fail("Nie zadziałał wyjątek!");
        } catch (IllegalArgumentException e) {
        }

        w.addPunkt(new Punkt(4, 5));
        assertEquals(1, w.Pole(), 0.1);

        w = new Wielokat(4);
        w.addPunkt(new Punkt(0, 0));
        w.addPunkt(new Punkt(0, 3));
        w.addPunkt(new Punkt(4, 0));
        w.addPunkt(new Punkt(2, 0));
        assertEquals(6, w.Pole(), 0.1);
    }

}
