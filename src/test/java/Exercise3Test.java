import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise3Test {
    @Test
    public void test_isPrimeNumber(){
        assertEquals(new Exercise3().isPrimeNumber(1),false);
        assertEquals(new Exercise3().isPrimeNumber(2),true);
        assertEquals(new Exercise3().isPrimeNumber(4),false);
    }
    @Test
    public void test_analysisPrimeNumber(){
        assertEquals(new Exercise3().analysisPrimeNumber(12),"2*2*3");
        assertEquals(new Exercise3().analysisPrimeNumber(7),"7");
        assertEquals(new Exercise3().analysisPrimeNumber(9),"3*3");
    }

}
