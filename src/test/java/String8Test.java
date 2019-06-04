import org.junit.Assert;
import org.junit.Test;

public class String8Test {
    @Test
    public void test_standardizeString(){
        Assert.assertEquals(new String8().standardizeString("nguyen thi nhi.lop 15T3;truong dhbk Da   nang"),
                "Nguyen thi nhi. Lop 15T3; Truong dhbk Da nang");
    }
}
