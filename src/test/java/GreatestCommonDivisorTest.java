import org.junit.Test;

import static org.junit.Assert.*;

public class GreatestCommonDivisorTest {

    GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
    int result;

    @Test
    public void shouldReturnThreeForTwelveAndThreeInMethodRecursively(){
        result = greatestCommonDivisor.gcdRecursively(12,3);
        assertEquals(3, result);
    }

}