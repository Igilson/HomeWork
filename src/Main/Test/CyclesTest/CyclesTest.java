package CyclesTest;
import Cycles.Cycles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CyclesTest {
    Cycles cycles = new Cycles() ;

    @Test
    public void TestCycles1() {

        String actual = cycles.Cycles1();
        String expected = "Сумма четных чисел от 1 до 99 = 2401\n" +
                "Количество четных чисел от 1 до 99 = 49";

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestCycles2_1() {

        String actual = cycles.Cycles2(89);
        String expected = "Это число является простым.";

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestCycles2_2() {

        String actual = cycles.Cycles2(65);
        String expected = "Это число является состовным.";

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestCycles3_SequentialSelection() {

        int actual = cycles.Cycles3SequentialSelection(25);
        int expected = 5;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestCycles3_BinarySearch() {

        int actual = cycles.Cycles3BinarySearch(81);
        int expected = 9;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestCycles4_FactorialOfANumber_1() {

        int actual = cycles.Cycles4FactorialOfANumber(5);
        int expected = 120;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestCycles4_FactorialOfANumber_2() {

        int actual = cycles.Cycles4FactorialOfANumber(0);
        int expected = 1;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestCycles5_SumOfDigits() {

        String actual = cycles.Cycles5SumOfDigits(143);
        String expected = "8";

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestCycles6_MirroredNumbers() {

        String actual = cycles.Cycles6MirroredNumbers(834);
        String expected = "438";

        Assertions.assertEquals(expected,actual);
    }
}

