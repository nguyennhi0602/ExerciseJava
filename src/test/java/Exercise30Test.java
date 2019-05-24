import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise30Test {
    @Test
    public void test_getFloorIndex() {
        assertEquals(new Exercise30().getFloorIndex(456), 3);
        assertEquals(new Exercise30().getFloorIndex(400), 3);
    }

    @Test
    public void test_getRomaNumberByDecimalNumber() {
        assertEquals(new Exercise30().getRomaNumberByDecimalNumber(5), "V");
        assertEquals(new Exercise30().getRomaNumberByDecimalNumber(895), "DCCCXCV");
        assertEquals(new Exercise30().getRomaNumberByDecimalNumber(3999), "MMMCMXCIX");
    }
}
