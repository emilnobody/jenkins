package test.java;

import junit.framework.TestCase;
import main.java.Utils;
import org.junit.Test;

/**
 * Created by kasper on 10.04.16.
 */
public class UtilsTest extends TestCase {

    @Test
    public void test1(){

        assertEquals(4, Utils.multiplyBy4(1));
        assertEquals(16, Utils.multiplyBy4(4));
        assertEquals(false, Utils.isEven(3));
        assertEquals(true, Utils.isEven(10));
        assertEquals(true, Utils.isEven(-10));
    }
}