/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import dane.Lamana;
import dane.Odcinek;
import dane.Punkt;
import logika.KlasySettings;
import logika.MRandom;

/**
 *
 * @author Michał Dolecki <>
 */
public class Wielokat extends Figura {

    private int nextIdx;

    public Wielokat(int liczbaWierzcholkow) {
        wierzcholki = new Punkt[liczbaWierzcholkow];
        nextIdx = 0;
    }

    /**
     * Dodaje do wielokąta kolejny wierzchołek i zwraca true jeżeli to się udało
     * albo false, gdy nie było już miejsca.
     *
     * @param p Nowy wierzchołek.
     * @return true jeżeli wierzchołek został dodany, false w przeciwnym
     * przypadku.
     */
    public boolean addPunkt(Punkt p) {
        if (nextIdx == wierzcholki.length) {
            return false;
        }
        wierzcholki[nextIdx++] = p;
        return true;
    }

    /**
     * Zwraca przybliżone pole figury stosując algorytmy randomizowalne (Metody
     * Monte Carlo).
     *
     * @return
     */
    @Override
    public double Pole() {
        MRandom rand = new MRandom();
        double x;
        double y;

        Lamana l = new Lamana();
        if (nextIdx < 3) {
            throw new IllegalArgumentException("Za mało punktów!");
        }
        if (nextIdx < wierzcholki.length) {
            throw new IllegalArgumentException("Nie ma wszystkich punktów!");
        }
        l.addElement(new Odcinek(wierzcholki[0], wierzcholki[1]));
        for (int i = 2; i < nextIdx; i++) {
            l.addElement(wierzcholki[i]);
        }

        int liczbaTrafionych = 0;

        for (int i = 0; i < KlasySettings.liczbaLosowan; i++) {
            x = rand.nextDouble(minX(), maxX());
            y = rand.nextDouble(minY(), maxY());

            if (isInside(new Punkt(x, y), l)) {
                liczbaTrafionych++;
            }
        }

        return (double) liczbaTrafionych / KlasySettings.liczbaLosowan * (maxX() - minX()) * (maxY() - minY());
    }

    public boolean isInside(Punkt p, Lamana l) {
        Odcinek[] sectors = l.getLamana();
        int crossCount = 0;
        double[] lineCoefs;
        double minx, maxx;
        for (Odcinek sector : sectors) {
            minx = Math.min(sector.getA().getX(), sector.getB().getX());
            maxx = Math.max(sector.getA().getX(), sector.getB().getX());
            if (minx <= p.getX() && maxx >= p.getX()) {
                lineCoefs = line(sector.getA(), sector.getB());
                if (lineCoefs[0] * p.getX() + lineCoefs[1] >= p.getY()) {
                    crossCount++;
                }
            }
        }
        Odcinek last = new Odcinek(l.getPoczatek(), l.getKoniec());
        minx = Math.min(last.getA().getX(), last.getB().getX());
        maxx = Math.max(last.getA().getX(), last.getB().getX());
        if (minx <= p.getX() && maxx >= p.getX()) {
            lineCoefs = line(last.getA(), last.getB());
            if (lineCoefs[0] * p.getX() + lineCoefs[1] >= p.getY()) {
                crossCount++;
            }
        }
        return crossCount % 2 != 0;

    }

    double[] line(Punkt A, Punkt B) {
        double[] coefs = new double[2];
        coefs[0] = (B.getY() - A.getY()) / (B.getX() - A.getX());
        coefs[1] = coefs[0] * (-A.getX()) + A.getY();
        return coefs;
    }
}
