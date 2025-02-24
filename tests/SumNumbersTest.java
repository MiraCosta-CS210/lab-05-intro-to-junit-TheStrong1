import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SumNumbersTest {

    @Test
    public void testSumNumbers1() {
        SumNumbers sumNumbers = new SumNumbers();
        int result1 = sumNumbers.sumIsEven(1,1);
        assertEquals(1, result1, "1 + 1 is even, should return 1 (true).");

    }


    @Test
    public void testSumNumbers2() {
        SumNumbers sumNumbers2 = new SumNumbers();
        int result2 = sumNumbers2.sumIsEven(1,2);
        assertEquals(0, result2, "1 + 2 is odd, should return 0 (false) ");

    }


}
