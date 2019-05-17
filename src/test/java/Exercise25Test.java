import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise25Test {
    @Test
    public void test_countFibonaciNumber(){
        assertEquals(new Exercise25().countFibonaciNumber(0,0),0);
        assertEquals(new Exercise25().countFibonaciNumber(1,3),4);
        assertEquals(new Exercise25().countFibonaciNumber(1,4),4);

    }
}
