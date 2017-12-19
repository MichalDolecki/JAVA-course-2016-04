package logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michał Dolecki <michal.dolecki@kul.pl>
 */
public class ClockTest {

  public ClockTest() {
  }

  @Test
  public void testGetAngle() {
    System.out.println("getAngle");
    int[] hours = new int[]{0, 1, 0, 23, 23};
    int[] mins = new int[]{0, 0, 15, 58, 59};
    double[] expResults = new double[]{0, 30, 82.5, 11, 5.5};
    double result;
    for (int i = 0; i < expResults.length; i++) {
      result = Clock.getAngle(hours[i], mins[i]);
      assertEquals(expResults[i], result, 0.01);
    }

  }

}
