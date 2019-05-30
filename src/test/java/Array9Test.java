import org.junit.Assert;
import org.junit.Test;

public class Array9Test {
    @Test
    public void binarySearch() {
        Assert.assertEquals(new Array9().binarySearch(new int[]{2, 3, 4, 5, 5, 6, 7, 8, 15}, 6), 5);
    }
}
