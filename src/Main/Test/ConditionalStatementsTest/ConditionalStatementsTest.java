package ConditionalStatementsTest;

import ConditionalStatements.ConditionalStatements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionalStatementsTest {

    ConditionalStatements conditionalStatements = new ConditionalStatements();

    @Test
    public void testConditionalStatements1_1(){

        int actual = conditionalStatements.ConditionalStatements1(3,2);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void testConditionalStatements1_2(){

        int actual = conditionalStatements.ConditionalStatements1(0,3);
        int expected = 0;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testConditionalStatements1_3(){

        int actual = conditionalStatements.ConditionalStatements1(-3,0);
        int expected = -3;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testConditionalStatements2_1(){

        String actual = conditionalStatements.ConditionalStatements2(1,1);
        String expected = "Quarter 1.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testConditionalStatements2_2(){

        String actual = conditionalStatements.ConditionalStatements2(-1,1);
        String expected = "Quarter 2.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testConditionalStatements2_3(){

        String actual = conditionalStatements.ConditionalStatements2(-1,-1);
        String expected = "Quarter 3.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testConditionalStatements2_4(){

        String actual = conditionalStatements.ConditionalStatements2(1,-1);
        String expected = "Quarter 4.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testConditionalStatements2_5(){

        String actual = conditionalStatements.ConditionalStatements2(0,1);
        String expected = "Point on the 'Y' between 1 and 2 quarters.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testConditionalStatements2_6(){

        String actual = conditionalStatements.ConditionalStatements2(-1,0);
        String expected = "Point on the 'X' between 2 and 3 quarters.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testConditionalStatements2_7(){

        String actual = conditionalStatements.ConditionalStatements2(0,0);
        String expected = "Point at the origin.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testConditionalStatements3_1(){

        int[] array = {1, -1, 2, 3, -6};
        int actual = conditionalStatements.ConditionalStatements3(array);
        int expected = 6;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testConditionalStatements3_2() {

        int[] array = {0, -8, -1, -6};
        int actual = conditionalStatements.ConditionalStatements3(array);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConditionalStatements4_1(){

        int actual = conditionalStatements.ConditionalStatements4(1,2,6);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConditionalStatements4_2(){

        int actual = conditionalStatements.ConditionalStatements4(0,3,1);
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConditionalStatements5_1(){

        String actual = conditionalStatements.ConditionalStatements5(80);
        String expected = "Grade B";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConditionalStatements5_2(){

        String actual = conditionalStatements.ConditionalStatements5(156);
        String expected = "Rating can be from 0 to 100.";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConditionalStatements5_3(){

        String actual = conditionalStatements.ConditionalStatements5(15);
        String expected = "Grade F";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConditionalStatements5_4(){

        String actual = conditionalStatements.ConditionalStatements5(25);
        String expected = "Grade E";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConditionalStatements5_5(){

        String actual = conditionalStatements.ConditionalStatements5(45);
        String expected = "Grade D";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConditionalStatements5_6(){

        String actual = conditionalStatements.ConditionalStatements5(65);
        String expected = "Grade C";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConditionalStatements5_7(){

        String actual = conditionalStatements.ConditionalStatements5(95);
        String expected = "Grade A";

        Assertions.assertEquals(expected, actual);
    }
}
