import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Exercise19Test {
    @Test
    public void test_calculateFactorial() {
        assertEquals(new Exercise19().calculateFactorial(5), 120);
    }

    @Test
    public void test_calculateC() {
        assertEquals(new Exercise19().calculateC(1, 5), 5);
    }
    @Test
    public void test_calculatePascal(){
        assertArrayEquals(new Exercise19().calculatePascal(5),new int[]{1,5,10,10,5,1});
        assertArrayEquals(new Exercise19().calculatePascal(8),new int[]{1,8,28,56,70,56,28,8,1});
        assertArrayEquals(new Exercise19().calculatePascal(0),new int[]{1});
        assertArrayEquals(new Exercise19().calculatePascal(1),new int[]{1,1});
    }
}
