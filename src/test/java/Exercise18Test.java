
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise18Test {

    @Test
    public void test_analysisPrimeNumber() {
        assertEquals(new Exercise18().getBinaryByDecimal(23), "10111");
        assertEquals(new Exercise18().getDecimalByDecimal(23), 29);
    }

}