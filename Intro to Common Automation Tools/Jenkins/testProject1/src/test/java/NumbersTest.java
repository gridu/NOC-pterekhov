import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    Numbers NUM = new Numbers();

    @Test
    public void SUM() {
        int actual = NUM.SUM(5);
        int expected = 15;
        assertEquals(expected,actual);
    }

    @Test
    public void multiply() {
        int actual = NUM.Multiply(5,5);
        int expected = 25;
        assertEquals(expected,actual);
    }

    @Test
    public void multiplyDouble() {
        double actual = NUM.MultiplyDouble(2.5,3);
        double expected = 7.5;
        assertEquals(expected,actual,1);
    }
}