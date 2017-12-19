/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Random;

/**
 *
 * @author Michał Dolecki <>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int liczbaProb = 10000000;
        int liczbaTrafien = 0;

        Random rand = new Random();
        Punkt p;

        for (int i = 0; i < liczbaProb; i++) {
            p = new Punkt(rand.nextDouble() * 2 - 1, rand.nextDouble() * 2 - 1);
            if (p.distance() <= 1) {
                liczbaTrafien++;
            }
        }

        double pi = 4.0 * liczbaTrafien / liczbaProb;
        System.out.println(pi);
    }

}
