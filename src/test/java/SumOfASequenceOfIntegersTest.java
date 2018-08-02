import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfASequenceOfIntegersTest {

    SumOfASequenceOfIntegers sum = new SumOfASequenceOfIntegers();
    int result;

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionOnNegativeParameters() {
        sum.sumRecursively(-4);
    }

    @Test
    public void shouldReturnSixForThreeInMethodRecursively(){
        result = sum.sumRecursively(3);
        assertEquals(6, result);
    }
}