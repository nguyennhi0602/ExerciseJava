import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {
    @Test
    public void test_caculateDivisorMax(){
        assertEquals(new Exercise1().caculateGCD(1,1),1);
        assertEquals(new Exercise1().caculateGCD(3,0),3);
    }
    @Test
    public void test_caculateMultipleMin(){
        assertEquals(new Exercise1().caculateLGM(4,8),0);
    }
}
