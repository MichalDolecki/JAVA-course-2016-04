package dane;

/**
 *
 * @author Student
 */
public class Punkt {

    private double x, y;

    public Punkt() {
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt (" + x + ", " + y + ')';
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Punkt p) {
        if (p == null) {
            throw new IllegalArgumentException("Brak punktu!!!");
        }
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }

    @Override
    public boolean equals(Object obj) {
        Punkt w = (Punkt) obj;
        return x == w.x && y == w.y;
        
      /*  if(x == w.x && y == w.y){
            return true;
        }else{
            return false;
        } */
    }

}
