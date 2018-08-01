import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    Factorial factorial = new Factorial();
    int result;

    @Test
    public void shouldReturnTwentyfourForFourInMethodRecursively() {
        result = factorial.factorialRecursively(4);
        assertEquals(24, result);
    }

    @Test
    public void shouldReturnTwentyfourForFourInMethodIteratively(){
        result = factorial.factorialIteratively(4);
        assertEquals(24, result);
    }

}