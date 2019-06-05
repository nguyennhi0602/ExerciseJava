import org.junit.Assert;
import org.junit.Test;

public class String12Test {
    @Test
    public void test_deleteDuplicateElement() {
        Assert.assertEquals(new String12().deleteDuplicateElement("aaaaaabcaaad"), "abcad");
        Assert.assertEquals(new String12().deleteDuplicateElement("abbbbbbccccd eeffffddbc"), "abcd efdbc");
    }
}
