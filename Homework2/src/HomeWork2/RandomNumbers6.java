package HomeWork2;

import java.util.Random;
public class RandomNumbers6 {
    public static void main(String[] args) {
        int countMin = 3;
        int countMax = 15;
        int countDiff = countMax - countMin;
        int min = -10;
        int max = 35;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(countDiff + 1) + countMin;
        int[] number = new int[i];
        for (i = 0; i < number.length; i++) {
            int d = random.nextInt(diff + 1) + min;
            System.out.println(d);
        }
    }
}
