import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest {

    double[] numbers = {10, 15, 15, 25, 35};

@Test
public void calculateSum() {
    assertEquals(100.0,
            StandardDeviation.sum(numbers),
            0.001);
}

@Test
public void calculateMean() {
    assertEquals(20.0,
            StandardDeviation.mean(numbers),
            0.001);
}

@Test
public void calculateMeanDeviation() {
    assertEquals(7.2,
            StandardDeviation.meanDeviation(numbers),
            0.001);
}

@Test
public void calculateVariance() {
    assertEquals(70.0,
            StandardDeviation.variance(numbers),
            0.001);
}

@Test
public void calculateStandardDeviation() {
    assertEquals(8.3666,
            StandardDeviation.standardDeviation(numbers),
            0.001);
}
