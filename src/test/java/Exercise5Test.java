import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise5Test {
    @Test
    public void test_caculateFibonaci(){
        assertEquals(new Exercise5().caculateFibonaci(1),1);
        assertEquals(new Exercise5().caculateFibonaci(3),2);
    }
    @Test
    public void test_listFibonaci(){
        assertEquals(new Exercise5().listFibonaci(1),"0");
        assertEquals(new Exercise5().listFibonaci(9),"1 1 2 3 5 8");
    }
}
