package dane;

/**
 *
 * @author Student
 */
public class Odcinek implements Mierzalny{

    private Punkt A;

    public Punkt getA() {
        return A;
    }

    public void setA(Punkt A) {
        this.A = A;
    }

    private Punkt B;

    public Punkt getB() {
        return B;
    }

    public void setB(Punkt B) {
        this.B = B;
    }

    public Odcinek(Punkt A, Punkt B) {
        this.A = A;
        this.B = B;
    }

    public Odcinek(double x0, double y0, double x1, double y1) {
        this.A = new Punkt(x0, y0);
        this.B = new Punkt(x1, y1);
    }

    @Override
    public double length(){
        return A.distance(B);
    }

    @Override
    public String toString() {
        return "Odcinek:\n\t"+A+"\n\t"+B;
    }
    
    
}
