import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise21Test {
    @Test
    public void test_numberOfDaysRemainIMonth(){
        assertEquals(new Exercise21().numberOfDaysRemainIMonth("15/03/2019"),16);
    }
    @Test(expected = RuntimeException.class)
    public void testInvalidDate() {
        assertEquals((new Exercise21()).numberOfDaysRemainIMonth("2005/2019"), 0);
    }
}
