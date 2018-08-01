import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    PrimeNumber primeNumber = new PrimeNumber();
    boolean result;

    @Test
    public void shouldReturnTrueForNumberFiveInMethodIteratively(){
        result = primeNumber.primeNumberIteratively(5);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForNumberTenInMethodIteratively(){
        result = primeNumber.primeNumberIteratively(10);
        assertFalse(result);
    }
}