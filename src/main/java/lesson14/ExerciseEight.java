package lesson14;

import java.util.Arrays;

public class ExerciseEight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Array before a shift:" + Arrays.toString(arr));
        shiftArray(arr, -25);
    }

    public static int[] shiftArray(int[] arr, int n) {

        int shiftNumber = n % arr.length;
        if (shiftNumber < 0) {
            shiftLeft(arr, shiftNumber);
        } else {
            shiftRight(arr, shiftNumber);
        }
        System.out.println("Array after a shift: " + Arrays.toString(arr) + " Number of steps= " + n);
        return arr;
    }

    private static void shiftRight(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }

    private static void shiftLeft(int[] arr, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
    }
}
