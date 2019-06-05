import org.junit.Assert;
import org.junit.Test;

public class String7Test {
    @Test
    public void test_getIndexOfSubString() {
        Assert.assertEquals(new String7().getIndexOfSubString("nguyen thi nhi nhi lop 15T3 nhi", "nhi lop 15T3"), 15);
        Assert.assertEquals(new String7().getIndexOfSubString("nhi lop 15T3 nhi", "nhi lop 15T3"), 0);
    }
}
