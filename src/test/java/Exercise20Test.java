import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise20Test {
    @Test
    public void test_calculateFibonaci(){
        assertEquals(new Exercise20().caculateFibonaci(3),2);
    }
    @Test
    public void test_calculateSum(){
        assertEquals(new Exercise20().calculateSum(5),12);
    }
}
