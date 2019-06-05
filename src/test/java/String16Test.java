import org.junit.Assert;
import org.junit.Test;

public class String16Test {
    @Test
    public void test_calculate() {
        Assert.assertEquals(new String16().calculate("128", "99973"), "100101");
        Assert.assertEquals(new String16().calculate("967", "185"), "1152");
    }
}
