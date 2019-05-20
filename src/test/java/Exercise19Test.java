import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class Exercise19Test {
    @Test
    public void test_calculatePascal(){
        assertArrayEquals(new Exercise19().calculatePascal(5),new int[]{1,5,10,10,5,1});
        assertArrayEquals(new Exercise19().calculatePascal(8),new int[]{1,8,28,56,70,56,28,8,1});
        assertArrayEquals(new Exercise19().calculatePascal(0),new int[]{1});
        assertArrayEquals(new Exercise19().calculatePascal(1),new int[]{1,1});
    }
}
