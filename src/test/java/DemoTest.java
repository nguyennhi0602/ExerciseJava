import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoTest {
    @Test
    public  void test_sum(){
        assertEquals(new Demo().sum(2,5),7);
    }
    @Test
    public void test_sub(){
        assertEquals(new Demo().sub(4,1),3);
    }
    @Test
    public void test_multiple(){
        assertEquals(new Demo().multiple(9,3),27);
    }
}



