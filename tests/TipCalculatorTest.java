import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TipCalculatorTest {

    @Test
    public void testCalculateTip_scenario1() {
        TipCalculator calculator = new TipCalculator();
        assertEquals(20.00, calculator.calculateTip(100.00, 20), 0.01);
    }


    @Test
    public void testCalculateTip_scenario2() {
        TipCalculator calculator = new TipCalculator();
        assertEquals(9.00, calculator.calculateTip(50.00, 18), 0.01);
    }
}
