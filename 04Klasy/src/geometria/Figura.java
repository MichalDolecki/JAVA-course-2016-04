package geometria;

import dane.Punkt;

/**
 *
 * @author Michał Dolecki <>
 */
public abstract class Figura implements Obliczenia {

    protected Punkt[] wierzcholki;

    @Override
    public double Obwod() {
        double ob = 0.0;
        for (int i = 0; i < wierzcholki.length - 1; i++) {
            ob += wierzcholki[i].distance(wierzcholki[i + 1]);
        }
        ob += wierzcholki[0].distance(wierzcholki[wierzcholki.length - 1]);
        return ob;
    }

    public double minX() {
        double w = wierzcholki[0].getX();
        for (Punkt punkt : wierzcholki) {
            if (punkt.getX() < w) {
                w = punkt.getX();
            }
        }
        return w;
    }

    public double maxX() {
        double w = wierzcholki[0].getX();
        for (Punkt punkt : wierzcholki) {
            if (punkt.getX() > w) {
                w = punkt.getX();
            }
        }
        return w;
    }

    public double minY() {
        double w = wierzcholki[0].getY();
        for (Punkt punkt : wierzcholki) {
            if (punkt.getY() < w) {
                w = punkt.getY();
            }
        }
        return w;
    }

    public double maxY() {
        double w = wierzcholki[0].getY();
        for (Punkt punkt : wierzcholki) {
            if (punkt.getY() > w) {
                w = punkt.getY();
            }
        }
        return w;
    }

}
