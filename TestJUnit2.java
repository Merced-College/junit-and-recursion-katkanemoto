import org.junit.Test;
import static org.junit.Assert.*;

public class TestJUnit2 {

    @Test
    public void testCountHi_1() {
        assertEquals(1 , TestingRecursion2.countHi("xxhixx") );
    }

    @Test
    public void testCountHi_2() {
        assertEquals(2 , TestingRecursion2.countHi("xxhixxhi") );
    }

    @Test
    public void testCountHi_3() {
        assertEquals(8 , TestingRecursion2.countHi("hihihihihihihihi") );
    }

    @Test
    public void testCountHi_4() {
        assertEquals(0 , TestingRecursion2.countHi("hhhhhhhhhxxxxxxxx") );
    }

    @Test
    public void testCountHi_5() {
        assertEquals(0 , TestingRecursion2.countHi(null) );
    }

    @Test
    public void testStringClean_1() {
        assertEquals("abcd" , TestingRecursion2.stringClean("aabbccd") );
    }

    @Test
    public void testStringClean_2() {
        assertEquals("abcd" , TestingRecursion2.stringClean("aaaaaaaaaaabbccd") );
    }

    
}
