package logika;

import java.util.Random;

/**
 * Klasa z dodatkowymi metodami do losowania liczb.
 *
 * @author Michał Dolecki <>
 */
public class MRandom {

    private Random rand;

    public MRandom() {
        rand = new Random();
    }

    public MRandom(long seed) {
        this.rand = new Random(seed);
    }

    /**
     * Funkcja losuje liczbę rzeczywistą z przedziału [min, max). Rozkład
     * jednostajny.
     *
     * @param min Najmniejsza możliwa wartość.
     * @param max Ograniczenie górne.
     * @return Losowa liczba z przedziału [min, max).
     */
    public double nextDouble(double min, double max) {
        double w;
        if (min > max) {
            w = max;
            max = min;
            min = w;
        }
        return rand.nextDouble() * (max - min) + min;
    }
}
