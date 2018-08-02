import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfASequenceOfIntegersTest {

    SumOfASequenceOfIntegers sum = new SumOfASequenceOfIntegers();
    int result;

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionOnNegativeParametersInMethodRecursively() {
        sum.sumRecursively(-4);
    }

    @Test
    public void shouldReturnSixForThreeInMethodRecursively(){
        result = sum.sumRecursively(3);
        assertEquals(6, result);
    }

    @Test
    public void shouldReturnZeroForZeroInMethodRecursively(){
        result = sum.sumRecursively(0);
        assertEquals(0, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionOnNegativeParametersInMethodIteratively(){
        sum.sumIteratively(-4);
    }

    @Test
    public  void shouldReturnSixForThreeInMethodIteratively(){
        result = sum.sumIteratively(3);
        assertEquals(6, result);
    }
}