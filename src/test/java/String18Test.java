import org.junit.Assert;
import org.junit.Test;

public class String18Test {
    @Test
    public void test_multiply(){
        Assert.assertEquals(new String18().multiply("123","2"),"246");
        Assert.assertEquals(new String18().multiply("458","7"),"3206");
        Assert.assertEquals(new String18().multiply("10002","7"),"70014");
    }

    @Test
    public void test_calculate(){
        Assert.assertEquals(new String18().calculate("123","23"),"2829");
        Assert.assertEquals(new String18().calculate("123","10000"),"1230000");
    }
}
