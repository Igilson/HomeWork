package ConditionalStatements;
import static java.lang.Integer.max;
public class ConditionalStatements {
    public int ConditionalStatements1(int a, int b) {
        if (a % 2 == 0) {
            return (a * b);
        } else {
            return (a + b);
        }
    }

    public String ConditionalStatements2(int x, int y) {
        String result = "";
        if (x > 0 && y > 0) {
            result = "Quarter 1.";
        }
        if (x < 0 && y > 0) {
            result = "Quarter 2.";
        }
        if (x < 0 && y < 0) {
            result = "Quarter 3.";
        }
        if (x > 0 && y < 0) {
            result = "Quarter 4.";
        }
        if (x > 0 && y == 0) {
            result = "Point on the 'X' between 1 and 4 quarters.";
        }
        if (x < 0 && y == 0) {
            result = "Point on the 'X' between 2 and 3 quarters.";
        }
        if (x == 0 && y > 0) {
            result = "Point on the 'Y' between 1 and 2 quarters.";
        }
        if (x == 0 && y < 0) {
            result = "Point on the 'Y' between 3 and 4 quarters.";
        }
        if (x == 0 && y == 0)
            result = "Point at the origin.";

        return result;
    }

    public int ConditionalStatements3(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 0)
                sum = sum + num;
        }
        return sum;
    }

    public int ConditionalStatements4(int a, int b, int c) {
        return (max(a * b * c, a + b + c)) + 3;
    }

    public String ConditionalStatements5(int rating) {
        String result = "";

        if (rating < 0 || rating > 100) {
            result = "Rating can be from 0 to 100.";
        }
        if (rating >= 0 && rating <= 19) {
            result = "Grade F";
        }
        if (rating >= 20 && rating <= 39) {
            result = "Grade E";
        }
        if (rating >= 40 && rating <= 59) {
            result = "Grade D";
        }
        if (rating >= 60 && rating <= 74) {
            result = "Grade C";
        }
        if (rating >= 75 && rating <= 89) {
            result = "Grade B";
        }
        if (rating >= 90 && rating <= 100) {
            result = "Grade A";
        }
        return result;
    }
}



