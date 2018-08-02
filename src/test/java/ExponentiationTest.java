import org.junit.Test;

import static org.junit.Assert.*;

public class ExponentiationTest {

    Exponentiation exponentiation = new Exponentiation();
    double result;
    private static final double DELTA = 1e-15;

    @Test
    public void shouldReturnEightForParametersTwoAndThreeInMethodRecursively(){
        result = exponentiation.exponentiationRecursively(2,3);
        assertEquals(8,result, DELTA);
    }

    @Test
    public void shouldReturnOneForExponentEEqualsZeroInFunctionRecursively(){
        result = exponentiation.exponentiationRecursively(2,0);
        assertEquals(1,result, DELTA);
    }

    @Test
    public void shouldReturnNegativeNumberInFunctionRecursively(){
        result = exponentiation.exponentiationRecursively(-2, 3);
        assertEquals(-8,result, DELTA);
    }

    @Test
    public void shouldReturnReverseNAndPositiveEInFunctionRecursively(){
        result = exponentiation.exponentiationRecursively(3, -1);
        assertEquals((double)1/3, result, DELTA);
    }

    @Test
    public void shouldReturnEightForParametersTwoAndThreeInMethodIteratively(){
        result = exponentiation.exponentiationIteratively(2,3);
        assertEquals(8,result, DELTA);
    }

    @Test
    public void shouldReturnOneForExponentEEqualsZeroInFunctionIteratively(){
        result = exponentiation.exponentiationIteratively(2,0);
        assertEquals(1,result, DELTA);
    }

    @Test
    public void shouldReturnNegativeNumberInFunctionIteriatively(){
        result = exponentiation.exponentiationIteratively(-2, 3);
        assertEquals(-8,result, DELTA);
    }

    @Test
    public void shouldReturnReverseNAndPositiveEInFunctionIteratively(){
        result = exponentiation.exponentiationIteratively(3, -1);
        assertEquals((double) 1/3, result, DELTA);
    }
}