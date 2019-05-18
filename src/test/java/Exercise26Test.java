import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise26Test {
    @Test
    public void test_calculateCrazyFibonaci(){
        assertEquals(new Exercise26().calculateCrazyFibonaci(6,2,2,1,4,2),2);
        assertEquals(new Exercise26().calculateCrazyFibonaci(6,2,2,1,4,8),6);
    }
}
