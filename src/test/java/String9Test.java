import org.junit.Assert;
import org.junit.Test;

public class String9Test {
    @Test
    public void test_getStringIsValid(){
        Assert.assertEquals(new String9().getStringIsValid("abcccceeeeeefdd"),"abc4e6fd2");
    }
}
