package test;

import com.demo.Calc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest2 {
    Calc c = new Calc();

    @Test
    public void addTest() {
        assertEquals(4.0, c.add(2, 2), 0.0001);
    }

    @Test
    public void subTest() {
        assertEquals(0.0, c.sub(2, 2), 0.0001);
    }

    @Test
    public void sumMem() {
        c.memMinus(15);
        assertEquals(-15, c.getMem(), 0.0001);
    }

    @Test
    public void addMem() {
        c.memPlus(5);
        assertEquals(5, c.getMem(), 0.0001);
    }

    @Test
    public void combineMem() {
        c.memMinus(5);
        c.memPlus(5);
        assertEquals(0, c.getMem(), 0.0001);
    }

    @Before
    public void before() {
        c.clearMem();
    }
}
