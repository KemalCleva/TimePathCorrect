package main.java.it.euris;

public class DistanceCalculator {
    private static final double KM_TO_METERS = 1000.0;
    private static final double NAUTICAL_MILE_TO_METERS = 1852.0;
    private static final double MILE_TO_METERS = 1609.344;

    /**
     *  kilometers per hour to meters per second.
     */
    public static double kphToMps(double kph) {
        return kph * KM_TO_METERS / 3600.0;
    }

    /**
     * nautical miles per hour to meters per second.
     */
    public static double knotsToMps(double knots) {
        return knots * NAUTICAL_MILE_TO_METERS / 3600.0;
    }

    /**
     * miles per hour to meters per second.
     */
    public static double mphToMps(double mph) {
        return mph * MILE_TO_METERS / 3600.0;
    }


    /**
     * @param distance: in meters.
     * @param speed: in meters per second.
     * @return the time needed to travel in h, m, s.
     */
    public static String computeTravelTime(double distance, double speed) {
        double timeInSeconds = distance / speed;
        int hours = (int) (timeInSeconds / 3600);
        int minutes = (int) ((timeInSeconds % 3600) / 60);
        int seconds = (int) (timeInSeconds % 60);
        return String.format("%d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }
}