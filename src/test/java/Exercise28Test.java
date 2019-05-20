import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise28Test {
    @Test
    public void test_calculateSquareOfNumber(){
        assertEquals(new Exercise28().calculateSquareOfNumber(1),1,0.01);
        assertEquals(new Exercise28().calculateSquareOfNumber(15.7),3.96,0.01);
        assertEquals(new Exercise28().calculateSquareOfNumber(0),0,0.01);
    }
}
