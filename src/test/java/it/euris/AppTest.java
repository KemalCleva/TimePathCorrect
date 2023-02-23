package test.java.it.euris;

import static org.junit.Assert.assertTrue;

import main.java.it.euris.DistanceCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AppTest 
{
    @Test
    public void givenKphToMpsWhen18Then5 () {
        double kph = 18;
        double mps = 5;
        double actualMiles = DistanceCalculator.kphToMps(kph);
        Assertions.assertEquals(mps, actualMiles, 0.0001);
    }


    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
