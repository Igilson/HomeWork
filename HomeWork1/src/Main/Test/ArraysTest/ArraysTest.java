package ArraysTest;

import Arrays.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {
    Arrays arrays = new Arrays();

    @Test
    public void testArrays1(){
        int [] array = {-5,10,20,-40,15,30,25};
        String actual = arrays.Arrays1(array);
        String expected = "-40";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testArrays2(){
        int [] array = {-5,10,20,-40,15,30,25};
        String actual = arrays.Arrays2(array);
        String expected = "30";

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testArrays3(){
        int [] array = {-5,10,20,-40,15,30,25};
        String actual = arrays.Arrays3(array);
        String expected = "3";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testArrays4(){
        int [] array = {-5,10,20,-40,15,30,25};
        String actual = arrays.Arrays4(array);
        String expected = "5";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testArrays5(){
        int [] array = {-5,10,20,-40,15,30,25};
        String actual = arrays.Arrays5(array);
        String expected = "0";

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testArrays6(){
        int [] array = {-5,10,20,-40,15,30,25};
        String actual = arrays.Arrays6(array);
        String expected = "[25, 30, 15, -40, 20, 10, -5]";

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testArrays7() {
        int[] array = {-5, 10, 20, -40, 15, 30, 25};
        String actual = arrays.Arrays7(array);
        String expected = "3";

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testArrays8() {
        int[] array = {-5, 10, 20, -40, 15, 30, 25, 55};
        String actual = arrays.Arrays8(array);
        String expected = "[15, 30, 25, 55, -5, 10, 20, -40]";

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testArrays9BubbleSort() {
        int[] array = {-5, 10, 20, -40, 15, 30, 25, 55};
        String actual = arrays.Arrays9BubbleSort(array);
        String expected = "[-40, -5, 10, 15, 20, 25, 30, 55]";

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testArrays9InsertSort() {
        int[] input = {-5, 10, 20, -40, 15, 30, 25, 55};
        String actual = arrays.Arrays9InsertSort(input);
        String expected = "[-40, -5, 10, 15, 20, 25, 30, 55]";

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testArrays9SelectSort() {
        int[] array = {-5, 10, 20, -40, 15, 30, 25, 55};
        String actual = arrays.Arrays9SelectSort(array);
        String expected = "[-40, -5, 10, 15, 20, 25, 30, 55]";

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testArrays10QuickSort() {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        int low = 0;
        int high = 9;
        String actual = arrays.Arrays10QuickSort(array, low, high);
        String expected = "[1, 1, 2, 3, 3, 4, 5, 5, 6, 9]";

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testArrays10MergeSort() {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        int low = 0;
        int high = 9;
        String actual = arrays.Arrays10MergeSort(array, low, high);
        String expected = "[1, 1, 2, 3, 3, 4, 5, 5, 6, 9]";

        Assertions.assertEquals(expected, actual);

    }
}
