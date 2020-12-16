package HomeWork2;

import java.util.Random;
public class RandomNumbers4 {
    public static void main(String[] args) {

        int min = 20;
        int max = 50;
        int diff = max - min;
        Random random = new Random();
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            int d = random.nextInt(diff + 1) + min;
            System.out.println(d);
        }
    }
}
