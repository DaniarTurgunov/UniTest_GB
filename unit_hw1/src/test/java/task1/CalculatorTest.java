package task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    public void results(){
        double result = 90.0;
        double resulttest = Calculator.calculatingDiscount(100,10);
        System.out.println(result + "|" + resulttest);
        assertEquals(result, resulttest);
    }
    @Test
    public void discountAmountCannotMore100() {
        String message = "Размер cкидки не может быть больше 100";
        Exception exception = assertThrows(ArithmeticException.class, () ->
                Calculator.calculatingDiscount(100, 110));
        assertEquals(message, exception.getMessage());
    }
    @Test
    public void discountAmountCannotLess0() {
        String message = "Размер скидки не может быть отрицательной";
        Exception exception = assertThrows(ArithmeticException.class, () ->
                Calculator.calculatingDiscount(100, -1));
        assertEquals(message, exception.getMessage());
    }
}
