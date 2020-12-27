package ConversionFuns;
import org.junit.Test;
import static org.junit.Assert.*;

public class HomeWork4Test {

    @Test
    public void testConversionFun_1() {
        int source = 5;
        String expected = "5";
        String actual = ConversionFuns.ConversionFun_1(source);
        assertEquals("Unexpected string value", expected, actual);
    }
    @Test
    public void testConversionFun_2() {
        double source = 5.5;
        String expected = "5.5";

        String actual = ConversionFuns.ConversionFun_2(source);
        assertEquals("Unexpected string value", expected, actual);
    }
    @Test
    public void testConversionFun_3() {
        assertEquals(5, ConversionFuns.ConversionFun_3("5"), 0);
    }
    @Test
    public void testConversionFun_4_1() {
        assertEquals(5.5, ConversionFuns.ConversionFun_4("5.5"), 0.00001);
    }
    @Test
    public void testConversionFun_4_2() {
        assertEquals("Not NaN for null", Double.NaN, ConversionFuns.ConversionFun_4(null),0.00001 );
    }
}
