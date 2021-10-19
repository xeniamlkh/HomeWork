public class HomeWorkTwo {
    public static void main(String[] args) {

        // TASK 1
        System.out.println("Task 1: " + trueOrFalse(7, 9));

        // TASK 2
        positiveNegative(-17);

        // TASK 3
        System.out.println("Task 3: " + positiveNegativeBool(-8));

        // TASK 4
        printString(3, "Task 4: Oh! Hello, beauty!");

        // TASK 5
        leapYear(2021);

    }

    // TASK 1
    public static boolean trueOrFalse(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // TASK 2
    public static void positiveNegative(int a) {
        if (a >= 0) {
            System.out.printf("Task 2: The number %d is positive%n", a);
        } else {
            System.out.printf("Task 2: The number %d is negative%n", a);
        }

    }

    // TASK 3
    public static boolean positiveNegativeBool(int a) {
        return a < 0;
    }

    // TASK 4
    public static void printString(int a, String str){
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    // TASK 5
    public static void leapYear(int year) {
        if (year % 4 != 0) {
            System.out.println(year + " is a common year");
        } else if (year % 100 != 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 400 != 0) {
            System.out.println(year + " is a common year");
        } else {
            System.out.println(year + " is a leap year");
        }
    }
}
