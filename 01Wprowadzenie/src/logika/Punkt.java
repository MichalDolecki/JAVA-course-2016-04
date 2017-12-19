package logika;

/**
 *
 *
 * @author Student
 */
public class Punkt {

    private double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    private double y;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punkt() {
        this.x = 0.0;
        this.y = 0.0;
    }

    @Override
    public String toString() {
        return "Punkt (" + x + ", " + y + ")";
    }

}
