import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class Exercise19Test {
    @Test
    public void test_calculatePascal(){
        assertArrayEquals(new Exercise19().calculatePascal(6),new int[]{1,5,10,10,5,1});
        assertArrayEquals(new Exercise19().calculatePascal(1),new int[]{1});
    }
}
