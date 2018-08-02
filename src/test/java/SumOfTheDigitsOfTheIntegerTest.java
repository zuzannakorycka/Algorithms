import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfTheDigitsOfTheIntegerTest {

    SumOfTheDigitsOfTheInteger sumOfTheDigitsOfTheInteger = new SumOfTheDigitsOfTheInteger();
    int result;

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionForNegativeParametersInMethod(){
        sumOfTheDigitsOfTheInteger.sumOfIntegerRecursively(-5);
    }

    @Test
    public void shouldReturnThreeForParametersTwelveInMethodRecursively(){
        result = sumOfTheDigitsOfTheInteger.sumOfIntegerRecursively(12);
        assertEquals(3, result);
    }

    @Test
    public void shouldReturnZeroForParametersZeroInMethodRecursively(){
        result = sumOfTheDigitsOfTheInteger.sumOfIntegerRecursively(0);
        assertEquals(0, result);
    }
}