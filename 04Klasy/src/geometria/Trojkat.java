/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import dane.Lamana;
import dane.Punkt;
import dane.PunktComparator;
import java.util.Arrays;

/**
 *
 * @author Michał Dolecki <>
 */
public class Trojkat extends Figura {

    public Trojkat(Punkt A, Punkt B, Punkt C) {
        if (A == null || B == null || C == null) {
            throw new IllegalArgumentException("Nieokreślony wierzchołek!");
        }

        Punkt[] posortowane = new Punkt[]{A, B, C};
        czyWspolliniowe(posortowane);

        wierzcholki = new Punkt[]{A, B, C};
    }

    private void czyWspolliniowe(Punkt[] posortowane) throws IllegalArgumentException {
        Punkt w;
//        if (posortowane[0].getX() > posortowane[1].getX()) {
//            w = posortowane[1];
//            posortowane[1] = posortowane[0];
//            posortowane[0] = w;
//        }
//        if (posortowane[1].getX() > posortowane[2].getX()) {
//            w = posortowane[2];
//            posortowane[2] = posortowane[1];
//            posortowane[1] = w;
//        }
        Arrays.sort(posortowane, new PunktComparator());

        double[] funkcja = line(posortowane[0], posortowane[2]);
        if (posortowane[1].getY() == funkcja[0] * posortowane[1].getX() + funkcja[1]) {
            throw new IllegalArgumentException("Punkty współliniowe!!!");
        }
    }

    public Trojkat(Lamana l) {
        if (l.getLamana().length != 3) {
            throw new IllegalArgumentException("Zła liczba odcinków!");
        }
        if (!l.getPoczatek().equals(l.getKoniec())) {
            throw new IllegalArgumentException("Łamana nie tworzy trójkąta!");
        }
        Punkt A = l.getPoczatek();
        Punkt B = l.getLamana()[0].getB();
        Punkt C = l.getKoniec();
        wierzcholki = new Punkt[]{A, B, C};
//        this(A, B, C);
    }

    public void setWierzcholki(Punkt A, Punkt B, Punkt C) {
        if (A == null || B == null || C == null) {
            throw new IllegalArgumentException("Nieokreślony wierzchołek!");
        }

        Punkt[] posortowane = new Punkt[]{A, B, C};
        czyWspolliniowe(posortowane);

        wierzcholki[0] = A;
        wierzcholki[1] = B;
        wierzcholki[2] = C;
    }

    public void setWierzcholek(int idx, Punkt P) {
        if (idx < 0 || idx > 2 || P == null) {
            throw new IllegalArgumentException("Błąd parametru!!!");
        }
        Punkt[] posortowane = new Punkt[3];
        for (int i = 0; i < posortowane.length; i++) {
            if (i == idx) {
                posortowane[i] = P;
            } else {
                posortowane[i] = wierzcholki[i];
//                posortowane[i] = new Punkt(wierzcholki[i].getX(), wierzcholki[i].getY());
            }
        }
        czyWspolliniowe(posortowane);
        wierzcholki[idx] = P;
    }

    @Override
    public double Pole() {
        double a = wierzcholki[0].distance(wierzcholki[1]);
        double b = wierzcholki[1].distance(wierzcholki[2]);
        double c = wierzcholki[0].distance(wierzcholki[2]);

        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double[] line(Punkt A, Punkt B) {
        double[] coefs = new double[2];
        coefs[0] = (B.getY() - A.getY()) / (B.getX() - A.getX());
        coefs[1] = coefs[0] * (-A.getX()) + A.getY();
        return coefs;
    }
}
