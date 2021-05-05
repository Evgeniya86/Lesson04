package Lesson04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FunctionTest {
    Function function = new Function();
    @Test
    void testGivenSquareWhenCheckIsEvenThenTrue() {
        boolean result = function.Square(2,4,6);
        Assertions.assertTrue(result);
    }
    @Test
    void testGivenSquareWhenCheckIsOddThenTrue() {
        boolean result = function.Square(3,5,9);
        Assertions.assertTrue(result);
    }
}
