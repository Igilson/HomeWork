package com.deveducation.game.randomizer;

import java.util.Random;
import java.util.Scanner;

public class Randomizer {
    Scanner scanner;
    Random random;

    public Randomizer() {
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public void start() {
        System.out.println("Введите минимальное значение:");
        int min = scanner.nextInt();
        System.out.println("Введите максимальное значение: ");
        int max = scanner.nextInt();
        int[] array = new int[max - min + 1];
        int count = 0;

        while (true) {
            String userCommand = scanner.nextLine();
            if (userCommand.equalsIgnoreCase("exit")) {
                System.out.println("До свидания!");
                System.exit(0);
            }
            if (userCommand.equalsIgnoreCase("generate")) { // GeNerAte
                if (array.length == count) {
                    System.out.println("Все уникальные числа закончились! До свидания!");
                    System.exit(0);
                }
                while (true) {
                    int randomValue = random.nextInt((max - min) + 1) + min;
                    if (array[randomValue - min] == 0) {
                        array[randomValue - min] = randomValue;
                        System.out.println(randomValue);
                        count++;
                        break;
                    }
                }
            }
        }
    }
}
