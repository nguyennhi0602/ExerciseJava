import org.junit.Assert;
import org.junit.Test;

public class String3Test {
    @Test
    public void test_isSymmetryString() {
        Assert.assertEquals(new String3().isSymmetryString("abcba"), true);
        Assert.assertEquals(new String3().isSymmetryString("agsdhgashsg"), false);
    }
}
