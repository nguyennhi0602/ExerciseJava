import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise29Test {
    @Test
    public void test_getDecimalByRomaNumber() {
        assertEquals(new Exercise29().getDecimalByRomaNumber("DCCCXCV"), 895);
        assertEquals(new Exercise29().getDecimalByRomaNumber("X"), 10);
    }
}
