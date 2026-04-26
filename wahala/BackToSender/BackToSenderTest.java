import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class BackToSenderTest {

    @Test
    public void testLessThan50Percent() {
        int result = BackToSender.calculateWage(25);
        assertEquals(9000, result);
    }

    @Test
    public void test50To59Percent() {
        int result = BackToSender.calculateWage(55);
        assertEquals(16000, result);
    }

    @Test
    public void test60To69Percent() {
        int result = BackToSender.calculateWage(65);
        assertEquals(21250, result);
    }

    @Test
    public void test70PercentAndAbove() {
        int result = BackToSender.calculateWage(80);
        assertEquals(45000, result);
    }
}
