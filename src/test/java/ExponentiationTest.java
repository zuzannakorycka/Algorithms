import org.junit.Test;

import static org.junit.Assert.*;

public class ExponentiationTest {

    Exponentiation exponentiation = new Exponentiation();
    int result;

    @Test
    public void shouldReturnEightForParametersTwoAndThreeInMethodRecursively(){
        result = exponentiation.exponentiationRecursively(2,3);
        assertEquals(8,result);
    }
}