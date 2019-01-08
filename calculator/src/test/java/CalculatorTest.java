import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(3, calculator.add(2,1));
    }

    @Test
    public void canSubtract() {
        assertEquals(4, calculator.subtract(9,5));
    }

    @Test
    public void canMultiply() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    public void canDivide() {
        assertEquals(4, calculator.divide(20, 5));
    }
}
