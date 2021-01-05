package Arrays;

public class Arrays {
    public String Arrays1(int[] array) {

        int min = array[0];
        for (int i = 0; i != array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min + "";
    }

    public String Arrays2(int[] array) {

        int max = array[0];
        for (int i = 0; i != array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max + "";
    }

    public String Arrays3(int[] array) {
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return indexOfMin + "";
    }

    public String Arrays4(int[] array) {
        int indexOfMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return indexOfMax + "";
    }

    public String Arrays5(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum = sum + array[i];
            }
        }
        return sum + "";
    }

    public String Arrays6(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            array[i] = array[array.length - 1 -i];
            array[array.length - 1 - i] = a;
        }
        return "" + java.util.Arrays.toString(array);
    }

    public String Arrays7(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum += 1;
            }
        }
        return sum + "";
    }

    public String Arrays8(int[] array) {
        int size = array.length / 2;
        int add = array.length % 2 == 0 ? 0 : 1;
        for (int i = 0; i < size; i++) {
            int v = array[size + i + add];
            array[size + i + add] = array[i];
            array[i] = v;
        }
        return "" + java.util.Arrays.toString(array);
    }

    public String Arrays9BubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return "" + java.util.Arrays.toString(array);
    }

    public String Arrays9InsertSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key;
        }
        return "" + java.util.Arrays.toString(input);
    }
    public String Arrays9SelectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }

        return "" + java.util.Arrays.toString(array);
    }

    public String Arrays10QuickSort(int[] array, int low, int high) {


        if (array.length == 0){
            return null;
        }
        if (low >= high) {
            return null;
        }
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            Arrays10QuickSort(array, low, j);

        }
        if (high > i) {
            Arrays10QuickSort(array, i, high);
        }


        return "" + java.util.Arrays.toString(array);
    }
    public String Arrays10MergeSort(int[] array, int low, int high) {


        if (array.length == 0){
            return null;
        }
        if (low >= high) {
            return null;
        }
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            Arrays10QuickSort(array, low, j);

        }
        if (high > i) {
            Arrays10QuickSort(array, i, high);
        }


        return "" + java.util.Arrays.toString(array);
    }

}
