import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void case1() {
        Calculator calc = new Calculator();
        String expected="EEEE";
        String actual=calc.kic(-5);
        assertEquals(expected,actual);
    }
    @Test
    void case2() {
        Calculator calc = new Calculator();
        String expected="EEEE";
        String actual=calc.kic(-1);
        assertEquals(expected,actual);
    }
    @Test
    void case3() {
        Calculator calc = new Calculator();
        String expected="0g";
        String actual=calc.kic(0);
        assertEquals(expected,actual);
    }
    }
