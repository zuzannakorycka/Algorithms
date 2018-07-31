import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciNumberTest {

    FibonacciNumber fibonacciNumber = new FibonacciNumber();
    int result;

    @Test
    public void shouldReturnEightForParameterSixInMethodFibonacciRecursively(){
        result = fibonacciNumber.fibonacciRecursively(6);
        assertEquals(8, result);
    }

}
