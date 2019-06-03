import org.junit.Assert;
import org.junit.Test;

public class String5Test {
    @Test
    public void test_findDuplicateElement() {
        Assert.assertEquals(new String5().findDuplicateElement("nhi nguyen   nhi ha ha nhi"), "nhi");
    }
}
