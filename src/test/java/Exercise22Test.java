import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise22Test {
    @Test
    public void test_numberDaysOfYearRemaining(){
        assertEquals(new Exercise22().numberDaysOfYearRemaining("12/02/2019"),322);
    }
    @Test(RuntimeException)
    public void test_numberDaysOfYearRemaining(){
        assertEquals(new Exercise22().numberDaysOfYearRemaining("12/02/2019"),0);
    }

}
