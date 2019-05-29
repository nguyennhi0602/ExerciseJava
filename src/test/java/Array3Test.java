import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Array3Test {
    @Test
    public void test_calculate(){
        assertEquals(new Array3().calculate(new int[]{2,3,4,5,1,2,4,2}),5);
        assertEquals(new Array3().calculate(new int[]{2,6,4,5,1}),6);
    }
}
