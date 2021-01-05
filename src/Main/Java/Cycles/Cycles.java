package Cycles;


public class Cycles {
    public String Cycles1() {
        String result;
        int sum = 0;
        int count = 0;
        for (int i = 1; i < 99; i += 2) {
            sum = sum + i;
            count++;
        }

        result = "Сумма четных чисел от 1 до 99 = " + sum + '\n' +
                "Количество четных чисел от 1 до 99 = " + count;
        return result;
    }

    public String Cycles2(int b) {
        String result1 = "Это число является простым.";
        String result2 = "Это число является состовным.";
        int i;
        boolean isPrimes = false;
        for (i = 2; i < b; i++) {
            if (b % i == 0) {
                isPrimes = true;
                break;
            }
        }
        if (isPrimes) {
            return result2;
        } else {
            return result1;
        }

    }

    public int Cycles3SequentialSelection(int key) {
        for (int i = 1; ; i++) {
            int q = i * i;
            if (key == q) {
                return i;
            }
            if (key < q) {
                return i - 1;
            }
        }
    }

    public int Cycles3BinarySearch(int key) {
        int min = 1;
        int max = key;
        int prev = 0;
        for (; ; ) {
            int mid = (min + max) / 2;
            if (prev == mid) {
                return mid;
            }
            int q = mid * mid;
            if (key == q) {
                return mid;
            }
            if (key < q) {
                max = mid;
            } else min = mid;
            prev = mid;

        }
    }
    public int Cycles4FactorialOfANumber(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public String Cycles5SumOfDigits(int n) {
        int sum = 0;
        for (; n != 0; n /= 10) {
            sum += (n % 10);
        }
        return "" + sum;
    }

    public String Cycles6MirroredNumbers(int n) {
        String s = String.valueOf(n);
        StringBuilder result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }

        return "" + result;
    }

}

