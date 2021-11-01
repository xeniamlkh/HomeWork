import java.sql.SQLOutput;
import java.util.Arrays;

public class HomeWorkThree {
    public static void main(String[] args) {
        // calling Task N1
        myMethodTaskOne();

        // calling Task N2
        myMethodTaskTwo();

        // calling Task N3
        myMethodTaskThree();

        // calling Task N4
        myMethodTaskFour(9);

        // calling task N5
        System.out.println("TASK 5: " + Arrays.toString(myMethodTaskFive(6, 111)));

        // calling task N6
        myMethodTaskSix(7);

        // calling task N7
        int[] arrCheck = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("TASK 7: " + myMethodTaskSeven(arrCheck));

        // calling task N8
        int[] arr = {1, 2, 3, 4, 5, 6};
        myMethodTaskEight(arr, -3);

    }

    // Task N1. Create an array and then replace numbers. The array is automatically generated with a method Random
    public static void myMethodTaskOne() {
        int[] zeroOneArray = new int[10];
        for (int i = 0; i < zeroOneArray.length; i++) {
            zeroOneArray[i] = (int) (Math.round(Math.random()));
        }
        System.out.println("TASK 1. My generated array BEFORE numbers replacement: " + Arrays.toString(zeroOneArray));

        for (int i = 0; i < zeroOneArray.length; i++) {
            if (zeroOneArray[i] == 1) {
                zeroOneArray[i] = 0;
            } else {
                zeroOneArray[i] = 1;
            }
        }
        System.out.println("TASK 1. My generated array AFTER numbers replacement: " + Arrays.toString(zeroOneArray));

    }

    // Task N2. Create an array and fill it with 100 numbers in order
    public static void myMethodTaskTwo() {
        int[] hundredArr = new int[100];
        int j = 1;

        for (int i = 0; i < hundredArr.length; i++) {
            hundredArr[i] += j;
            j++;
        }

        System.out.println("TASK 2. The array of one hundred  numbers: " + Arrays.toString(hundredArr));
    }

    // Task N3. Create an array and all the numbers < 6 multiply by 2
    public static void myMethodTaskThree() {
        int[] multyArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("TASK 3. An array BEFORE changes: " + Arrays.toString(multyArr));

        for (int i = 0; i < multyArr.length; i++) {
            if (multyArr[i] < 6) {
                multyArr[i] = multyArr[i] * 2;
            }
        }

        System.out.println("TASK 3. An array AFTER changes: " + Arrays.toString(multyArr));
    }

    // Task N4. Create an int 2D-array (rows = columns), fill diagonally with 1
    public static void myMethodTaskFour(int size) {
        int[][] twoDArray = new int[size][size];

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray.length; j++) {
                if (i == j || i + j == size - 1) {
                    twoDArray[i][j] = 1;
                }
            }
        }
        System.out.println("TASK 4. The array filled diagonally with 1: " + Arrays.deepToString(twoDArray));
    }

    // Task N5. Create an array of the size of len and an every element should be equal to initialValue
    public static int[] myMethodTaskFive(int len, int initialValue) {

        int[] lenArr = new int[len];

        for (int i = 0; i < lenArr.length; i++) {
            lenArr[i] = initialValue;
        }
        return lenArr;
    }

    // Task N6. Create an array and find max/min
    public static void myMethodTaskSix(int size) {

        int[] minMaxArr = new int[size];

        for (int i = 0; i < minMaxArr.length; i++) {
            minMaxArr[i] = (int) (Math.random() * 1001);
        }

        int max = 0;
        for (int el : minMaxArr) {
            if (max < el) {
                max = el;
            }
        }

        int min = max;
        for (int el : minMaxArr) {
            if (min > el) {
                min = el;
            }
        }

        System.out.printf("TASK 6. Generated array: %s. Maximum number = %d. Minimum number = %d.%n", Arrays.toString(minMaxArr), max, min);

    }

    // Task N7. Compare two parts of the array
    public static boolean myMethodTaskSeven(int[] arrCheck) {
        int checkSum = 0;
        int sum = 0;

        for (int i = 0; i < arrCheck.length; i++) {
            checkSum += arrCheck[i];
        }
        for (int i = 0; i < arrCheck.length; i++) {
            sum += arrCheck[i];
            if (sum == checkSum / 2) {
                return true;
            }
        }
        return false;
    }

    // Task 8.
    public static void myMethodTaskEight(int[] arr, int n) {

        System.out.println("TASK 8. My array BEFORE moving: " + Arrays.toString(arr));

        int temp = 0;
        int x = 0;

        //decreasing n - to reduce the number of loops
        if (n > (arr.length - 1)) {
            while (n > (arr.length - 1)) {
                if (n <= (arr.length - 1)) {
                    break;
                } else {
                    n = n - arr.length;
                }
            }
        }

        // if n > 0; the array is moving to the left
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (arr.length - 1); j++) {
                x = j + 1;
                temp = arr[j];
                arr[j] = arr[x];
                arr[x] = temp;
            }
        }

        // if n < 0; the array is moving to the left
        for (int i = 0; i > n; i--) {
            for (int j = 0; j < (arr.length - 1); j++) {
                x = j + 1;
                temp = arr[j];
                arr[j] = arr[x];
                arr[x] = temp;
            }
        }

        System.out.println("TASK 8. My array AFTER moving. With any n it's moving to the left: " + Arrays.toString(arr));
    }

}
