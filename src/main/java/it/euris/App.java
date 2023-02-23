package main.java.it.euris;

public class App {
    public static void main(String[] args) {
        double distance = 500000; // 500 km in meters
        double speedInKnots = 23;
        double speedInMps = DistanceCalculator.knotsToMps(speedInKnots);
        String travelTime = DistanceCalculator.computeTravelTime(distance, speedInMps);
        System.out.println(travelTime); // Output: "11 hours, 44 minutes, 17 seconds"
    }
}