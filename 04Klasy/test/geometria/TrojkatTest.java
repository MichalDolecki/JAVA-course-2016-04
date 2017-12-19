/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import dane.Punkt;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michał Dolecki <>
 */
public class TrojkatTest {

    public TrojkatTest() {
    }

    @Test
    public void testPole() {
        System.out.println("Pole");
        Punkt A = new Punkt(0, 0);
        Punkt B = new Punkt(1, 0);
        Punkt C = new Punkt(0, 1);

        Trojkat abc = new Trojkat(A, B, C);
        double expRes = 0.5;
        double res = abc.Pole();
        assertEquals(expRes, res, 0.0001);

        abc = new Trojkat(A, A, A);
        expRes = 0;
        res = abc.Pole();
        assertEquals(expRes, res, 0.0001);
    }

    @Test
    public void testObwod() {
        System.out.println("Obwod");
        Punkt A = new Punkt(0, 0);
        Punkt B = new Punkt(1, 0);
        Punkt C = new Punkt(0, 1);

        Trojkat abc = new Trojkat(A, B, C);
        double expRes = 2 + Math.sqrt(2);
        double res = abc.Obwod();
        assertEquals(expRes, res, 0.0001);
        
        abc = new Trojkat(A, A, A);
        expRes = 0;
        res = abc.Obwod();
        assertEquals(expRes, res, 0.0001);
    }

    @Test
    public void testWspolliniowe(){
        Punkt A = new Punkt(0, 0);
        Punkt B = new Punkt(1, 0);
        Punkt C = new Punkt(2, 0);
        Punkt D = new Punkt(5, 2);
        
        try{
            Trojkat abc = new Trojkat(A, B, C);
            fail("Nie działa wyjątek!!!");
        }catch(IllegalArgumentException e){
            
        }
        
        Trojkat abd = new Trojkat(A, B, D);
        double poleStart = abd.Pole();
        try{
            abd.setWierzcholki(A, B, C);
            fail("Nie działa wyjątek!!!");
        }catch(IllegalArgumentException e){
            
        }
        double poleAll = abd.Pole();
        try{
            abd.setWierzcholek(2, C);
            fail("Nie działa wyjątek!!!");
        }catch(IllegalArgumentException e){
            
        }
        double poleOne = abd.Pole();
        
        assertEquals(poleStart, poleAll, 0.0001);
        assertEquals(poleStart, poleOne, 0.0001);
    }
    
    @Test
    public void testMinMax(){
        Punkt A = new Punkt(0, 0);
        Punkt B = new Punkt(1, 17);
        Punkt C = new Punkt(-5, -2);
        
        Trojkat abc = new Trojkat(A, B, C);
        assertEquals(-5, abc.minX(),0.00001);
        assertEquals(1, abc.maxX(),0.00001);
        assertEquals(-2, abc.minY(),0.00001);
        assertEquals(17, abc.maxY(),0.00001);
    }
}
