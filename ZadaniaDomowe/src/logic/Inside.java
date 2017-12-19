package logic;

import dane.Lamana;
import dane.Odcinek;
import dane.Punkt;

/**
 *
 * @author Michał Dolecki <michal.dolecki@kul.pl>
 */
public class Inside {

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
    return crossCount % 2 != 0;

  }

  double[] line(Punkt A, Punkt B) {
    double[] coefs = new double[2];
    coefs[0] = (B.getY() - A.getY()) / (B.getX() - A.getX());
    coefs[1] = coefs[0] * (-A.getX()) + A.getY();
    return coefs;
  }
}
