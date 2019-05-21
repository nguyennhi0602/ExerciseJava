import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise25Test {
    @Test
    public void test_countFibonaciNumber(){
        assertEquals(new Exercise25().countFibonaciNumber(2,0),0);
        assertEquals(new Exercise25().countFibonaciNumber(2,3),2);
        assertEquals(new Exercise25().countFibonaciNumber(1,34),9);

    }
}
