import org.junit.Assert;
import org.junit.Test;

public class String2Test {
    @Test
    public void test_getWordIsValid() {
        Assert.assertEquals(new String2().getWordIsValid("Nguyễn Thị Nhi lop 15T3"), "Nhi, lop, 15T3");
    }
}
