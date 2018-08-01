import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfASequenceOfIntegersTest {

    SumOfASequenceOfIntegers sum = new SumOfASequenceOfIntegers();

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionOnNegativeParameters() {
        sum.sumRecursively(-4);
    }

}