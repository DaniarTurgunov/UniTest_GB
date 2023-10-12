import hw.Number;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberTest {
    Number number = new Number(26);

    // Задание 1.
    // Тесты которые проверяют работу метода evenOddNumber, является ли переданное число четным или нечетным.

    @Test
    void evenOddNumberTestTrue() {
        boolean expectedResult = number.evenOddNumber();
        assertTrue(expectedResult, "Incorrect work of the method evenOddNumber()");
    }

    @Test
    void evenOddNumberTestFalse() {
        number.setN(5);
        boolean expectedResult = number.evenOddNumber();
        assertFalse(expectedResult, "Incorrect work of the method evenOddNumber()");
    }

    // Задание 2.
    // Тесты которые проверяют работу метода numberInInterval, попадает ли переданное число в заданый интервал

    @Test
    void numberInIntervalTestTrue() {
        boolean expectedResult = number.numberInInterval(25, 100);
        assertTrue(expectedResult, "Incorrect work of the method numberInInterval()");
    }

    @Test
    void numberInIntervalTestFalse() {
        number.setN(24);
        boolean expectedResult = number.numberInInterval(25, 100);
        assertFalse(expectedResult, "Incorrect work of the method numberInInterval()");
    }

}

