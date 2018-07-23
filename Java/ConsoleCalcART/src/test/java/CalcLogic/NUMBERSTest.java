package CalcLogic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NUMBERSTest {

    @Test
    public void SUM() {
        NUMBERS test1 = new NUMBERS();
        double actual = test1.SUM(5,5);
        double expected = 10.00;
        assertEquals(expected,actual,2);
    }

    @Test
    public void DIFF() {
        NUMBERS test1 = new NUMBERS();
        double actual =  test1.DIFF(10,5);
        double expected = 5.00;
        assertEquals(expected,actual,2);
    }

    @Test
    public void MULTIPLY() {
        NUMBERS test1 = new NUMBERS();
        double actual = test1.MULTIPLY(5,5);
        double expected = 25.00;
        assertEquals(expected,actual,2);
    }

    @Test
    public void DIVIDE() {
        NUMBERS test1 = new NUMBERS();
        double actual = test1.DIVIDE(15,5);
        double expected = 3.00;
        assertEquals(expected,actual,2);
    }
}