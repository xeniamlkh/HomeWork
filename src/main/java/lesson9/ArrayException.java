package lesson9;

import java.util.Arrays;

public class ArrayException {

    public static void myArrayMethod(int size) {
        if (size != 4) {
            throw new MyArraySizeException("Wrong array size");
        }
        String[][] myArr = new String[size][size];

        fillArray(size, myArr);
        System.out.println(Arrays.deepToString(myArr));

        iterateArray(myArr);

    }

    private static void fillArray(int size, String[][] myArr) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j && i == 2) {
                    myArr[i][j] = "X";
                } else {
                    int random = (int) (Math.random() * 11);
                    Integer num = random;
                    myArr[i][j] = num.toString();
                }
            }
        }
    }

    private static void iterateArray(String[][] myArr) {
        int numSum = 0;
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr.length; j++) {
                try {
                    int num = Integer.parseInt(myArr[i][j]);
                    numSum += num;
                } catch (NumberFormatException e) {
                    try {
                        throw new MyArrayDataException(i, j, myArr[i][j]);
                    } catch (MyArrayDataException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        System.out.println("The sum of all the elements in the array = " + numSum);
    }
}


