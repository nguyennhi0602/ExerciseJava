import org.junit.Assert;
import org.junit.Test;

public class String1Test {
    @Test
    public void test_getStringIsValid() {
        Assert.assertArrayEquals(new String1().getStringIsValid("Nguyen thi nhi.Truong DHBK Da Nang;Khoa cong nghe thong tin\nLop 15T3"),
                new String[]{"Nguyen thi nhi", "Truong DHBK Da Nang", "Khoa cong nghe thong tin", "Lop 15T3"});
    }
}
