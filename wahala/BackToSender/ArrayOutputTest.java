import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOutputTest {

    @Test
    public void testThatArrayCalculateTheRangeBetweenTheElementsOfArrays() {
        int [] numbers = {2,5,7,9,20};
        int actual = range.differenceBetweenLargestAndSmallest(numbers);
        int expected = 18
        assertEquals(18, result);
    }
    }

}
