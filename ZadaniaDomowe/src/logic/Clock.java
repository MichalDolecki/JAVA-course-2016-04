package logic;

/**
 *
 * @author Michał Dolecki <michal.dolecki@kul.pl>
 */
public class Clock {

  public static double getAngle(int hour, int min) {

    if (hour < 0 || hour > 24) {
      throw new IllegalArgumentException("Niepoprawna godzina!!!");
    }
    if (min < 0 || min > 59) {
      throw new IllegalArgumentException("Niepoprawna minuta!!!");
    }

    hour = hour > 12 ? hour - 12 : hour;

    double angleForMinute = 360.0 / 60;
    double minAngle = min * angleForMinute;

    double angleForHour = 360.0 / 12;
    double hourAngle = hour * angleForHour;

    double angleForCor = angleForHour / 60;
    double corAngle = min * angleForCor;

    double angle = Math.abs(hourAngle + corAngle - minAngle);

    return Math.min(angle, 360.0 - angle);
  }
}
