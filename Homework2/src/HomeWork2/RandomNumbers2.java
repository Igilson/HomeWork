package HomeWork2;

import java.util.Random;
class RandomNumbers2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            long d = random.nextLong();
            System.out.println(d);
        }
    }
}
