
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise6Test {
    @Test
    public void test_sloveEquation() {
        assertEquals(new Exercise6().sloveEquation(0, 1, 1), "Phuong trinh co nghiem: -1.0");
        assertEquals(new Exercise6().sloveEquation(0, 0, 0), "Phuong trinh vo so nghiem");
        assertEquals(new Exercise6().sloveEquation(0, 0, 1), "Phuong trinh vo nghiem");
        assertEquals(new Exercise6().sloveEquation(1, 2, 3), "Phuong trinh vo nghiem");
        assertEquals(new Exercise6().sloveEquation(1, 2, 1), "Phuong trinh co nghiem kep: -1.0");
        assertEquals(new Exercise6().sloveEquation(1, 5, 4), "Phuong trinh co hai nghiem x1= -1.0 x2= -4.0");

    }
}