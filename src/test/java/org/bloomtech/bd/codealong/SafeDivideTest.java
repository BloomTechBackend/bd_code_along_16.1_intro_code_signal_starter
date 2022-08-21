package org.bloomtech.bd.codealong;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SafeDivideTest {

    @Test
    public void test_safeDivideSolution_returnsCorrectValue() {
        SafeDivide safeDivide = new SafeDivide();
        double result = safeDivide.solution(16, -40);
        assertEquals(-0.4, result, "Safe Divide Tests Failed");
        double result2 = safeDivide.solution(24, 0);
        assertEquals(0, result2, "Safe Divide Tests Failed");
        double result3 = safeDivide.solution(86, -16);
        assertEquals(-5.375, result3, "Safe Divide Tests Failed");
        double result4 = safeDivide.solution(66, 32);
        assertEquals(2.0625, result4, "Safe Divide Tests Failed");
        double result5 = safeDivide.solution(0, 0);
        assertEquals(0, result5, "Safe Divide Tests Failed");
    }
}
