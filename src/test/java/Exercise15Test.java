import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise15Test {
    @Test
    public void test_isRightTriangle(){
        assertEquals(new Exercise15().isRightTriangle(6,8,10),true);
        assertEquals(new Exercise15().isRightTriangle(7,8,10),false);
    }
    @Test
    public void test_getArea(){
        assertEquals(new Exercise15().getArea(2,2,2),1.7,0.1);
    }
    @Test
    public void test_infoTriangle(){
        assertEquals(new Exercise15().infoTriangle(0,1,2),"tam giac khong hop le");
        assertEquals(new Exercise15().infoTriangle(2,6,3),"tam giac khong hop le");
        assertEquals(new Exercise15().infoTriangle(2,2,2),"tam giac deu chu vi 6.0 dien tich 1.7");
        assertEquals(new Exercise15().infoTriangle(2,3,2),"tam giac can chu vi 7.0 dien tich 2.0");
        assertEquals(new Exercise15().infoTriangle(6,8,10),"tam giac vuong chu vi 24.0 dien tich 24.0");
        assertEquals(new Exercise15().infoTriangle(4,5,6),"tam giac binh thuong chu vi 15.0 dien tich 9.9");

    }
}
