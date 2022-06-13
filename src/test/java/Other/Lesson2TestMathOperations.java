package Other;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lesson2TestMathOperations {

    @Test
    public void checkSumm() {
        Assert.assertTrue(summ(6,9) == 15);
        Assert.assertTrue(summ(4,9) == 13);
        Assert.assertTrue(summ(3,9) == 12);
    }
    @Test
    public void checkMult() {
        Assert.assertTrue(mult(6,9) == 54);
        Assert.assertTrue(mult(4,9) == 36);
        Assert.assertTrue(mult(3,9) == 27);
    }
    public int summ(int a, int b) {
        return a+b;
    }

    public int mult(int a, int b) {
        return a*b;
    }
}
