import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void case1() {
        Calculator calc = new Calculator();
        String expected = "EEEE";
        String actual = calc.kic(-5);
        assertEquals(expected, actual);
    }

    @Test
    void case2() {
        Calculator calc = new Calculator();
        String expected = "EEEE";
        String actual = calc.kic(-1);
        assertEquals(expected, actual);
    }

    @Test
    void case3() {
        Calculator calc = new Calculator();
        String expected = "0g";
        String actual = calc.kic(0);
        assertEquals(expected, actual);
    }

    @Test
    void case4() {
        Calculator calc = new Calculator();
        String expected = "1000g";
        String actual = calc.kic(1000);
        assertEquals(expected, actual);
    }

    @Test
    void case5() {
        Calculator calc = new Calculator();
        String expected = "2000g";
        String actual = calc.kic(2000);
        assertEquals(expected, actual);
    }

    @Test
    void case6() {
        Calculator calc = new Calculator();
        String expected = "EEEE";
        String actual = calc.kic(2001);
        assertEquals(expected, actual);
    }

    @Test
    void case7() {
        Calculator calc = new Calculator();
        String expected = "EEEE";
        String actual = calc.kic(2500);
        assertEquals(expected, actual);
    }
}