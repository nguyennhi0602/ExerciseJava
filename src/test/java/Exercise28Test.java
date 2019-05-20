import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise28Test {
    @Test
    public void test_calculateSquareOfNumber(){
        assertEquals(new Exercise28().calculateSquareOfNumber(2),1.41,0.01);
    }
}
