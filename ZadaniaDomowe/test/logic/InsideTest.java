package logic;

import dane.LamanaZamknieta;
import dane.Odcinek;
import dane.Punkt;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michał Dolecki <michal.dolecki@kul.pl>
 */
public class InsideTest {

  public InsideTest() {
  }

  @Test
  public void testIsInside() {
    LamanaZamknieta lamana = new LamanaZamknieta();
    lamana.addElement(new Odcinek(0, -1, 2, -1));
    lamana.addElement(new Punkt(2, 3));
    lamana.addElement(new Punkt(0, 3));

    Inside instance = new Inside();

    Punkt p;
    p = new Punkt(1, 1);
    assertTrue(instance.isInside(p, lamana));
    p = new Punkt(10, 1);
    assertFalse(instance.isInside(p, lamana));
    p = new Punkt(100, -10);
    assertFalse(instance.isInside(p, lamana));
  }

  @Test
  public void testLine() {
    System.out.println("line");
    Punkt A = new Punkt();
    Punkt B = new Punkt(1, 1);
    Inside instance = new Inside();
    double[] expResult = new double[]{1, 0};
    double[] result = instance.line(A, B);
    for (int i = 0; i < 2; i++) {
      assertEquals(expResult[i], result[i], 0.001);
    }
  }

}
