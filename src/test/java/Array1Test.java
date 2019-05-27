import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Array1Test {
    @Test
    public void test_findDuplicateElement() {
        assertEquals(new Array1().findDuplicateElement(new int[]{1, 2, 2, 1, 3, 4, 5, 2, 3, 4, 6, 1, 3}), Arrays.asList(1, 2, 3));
    }
}
