import SoftwareDev.RandomNumberMaker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRandomNumberMaker {
    int qtyThree = 3;
    int[] testRandomArray = RandomNumberMaker.makeRandomNumbers(qtyThree);

    /**
     * Test to ensure the array created by makeRandomNumbers is returning the correct number of values
     */
    @Test
    public void test_returnedArrayLengthEqualsThree(){
        assertEquals(3, testRandomArray.length);
    }
}
