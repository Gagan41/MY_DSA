package Math;

public class LC1344 {
    public double angleClock(int hour, int minutes) {
        double mina = minutes * 6.0;
        double houra = (hour % 12) * 30.0 + minutes * 0.5;

        double diff = Math.abs(houra - mina);

        return Math.min(diff, 360.0 - diff);
    }
}
