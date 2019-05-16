import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise8Test {
    @Test
    public void test_calculateFactorial(){
        assertEquals(new Exercise8().calculateFactorial(5),120);
    }
}
