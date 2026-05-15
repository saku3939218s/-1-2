import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    void kic0() {
        String expeced = "EEEE";
        String actual = calc.kic(-5);
        assertEquals(expeced, actual);
    }
    @Test
    void kic1() {

        String expected = "EEEE";
        String actual = calc . kic ( -1 );
        assertEquals (expected, actual);
    }
    @Test
    void kic2() {
        String actual = calc . kic ( 0 );
        String expected = "0g";

        assertEquals (expected, actual);
    }
    @Test
    void kic3() {
        String actual = calc . kic ( 1000 );
        String expected = "1000g";
        assertEquals (expected, actual);
    }
    @Test
    void kic4() {
        String actual = calc . kic ( 2000 );
        String expected = "2000g";
        assertEquals (expected, actual);
    }
    @Test
    void kic5() {
        String actual = calc . kic ( 2001 );
        String expected = "EEEE";
        assertEquals (expected, actual);
    }
    @Test
    void kic6() {
        String actual = calc . kic ( 3000 );
        String expected = "EEEE";
        assertEquals (expected, actual);
    }
}