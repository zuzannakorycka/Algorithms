import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfTheDigitsOfTheIntegerTest {

    SumOfTheDigitsOfTheInteger sumOfTheDigitsOfTheInteger = new SumOfTheDigitsOfTheInteger();
    int result;

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionForNegativeParametersInMethod(){
        sumOfTheDigitsOfTheInteger.sumOfIntegerRecursively(-5);
    }
}