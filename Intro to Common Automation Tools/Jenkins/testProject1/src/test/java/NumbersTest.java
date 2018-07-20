import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void SUM() {
        Numbers test1 = new Numbers();
        double actual = test1.SUM(5,5);
        double expected = 10.00;
        assertEquals(expected,actual,2);
    }

    @Test
    public void DIFF() {
        Numbers test1 = new Numbers();
        double actual =  test1.DIFF(10,5);
        double expected = 5.00;
        assertEquals(expected,actual,2);
    }

    @Test
    public void MULTIPLY() {
        Numbers test1 = new Numbers();
        double actual = test1.MULTIPLY(5,5);
        double expected = 25.00;
        assertEquals(expected,actual,2);
    }

    @Test
    public void DIVIDE() {
        Numbers test1 = new Numbers();
        double actual = test1.DIVIDE(15,5);
        double expected = 3.00;
        assertEquals(expected,actual,2);
    }
}