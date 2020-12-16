package HomeWork2;

import java.util.Random;
public class RandomNumbers3 {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            int d = random.nextInt(diff + 1) + min;
            System.out.println(d);
        }
    }
}
