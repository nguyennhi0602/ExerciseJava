import org.junit.Assert;
import org.junit.Test;

public class String6Test {
    @Test
    public void test_convert(){
        Assert.assertEquals(new String6().convert("nGUYEN tHI nHI"),"Nguyen Thi Nhi");
    }
}
