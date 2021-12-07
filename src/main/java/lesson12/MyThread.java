package lesson12;

public class MyThread {

    static final int SIZE = 100000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        firstMethod(SIZE);
        secondMethod(SIZE);
    }

    private static void firstMethod(int size) {
        float[] testArray = createArray(size);

        long a = System.currentTimeMillis();
        arrFormula(testArray);
        System.out.println("Time1 = " + (System.currentTimeMillis() - a));
    }

    private static void secondMethod(int size) {
        float[] testArray = createArray(size);

        float[] secondTestArray = new float[HALF];
        float[] thirdTestArray = new float[HALF];

        long a = System.currentTimeMillis();

        System.arraycopy(testArray, 0, secondTestArray, 0, HALF);
        System.arraycopy(testArray, HALF, thirdTestArray, 0, HALF);

        var t1 = new Thread(() -> arrFormula(secondTestArray));
        var t2 = new Thread(() -> arrFormula(thirdTestArray));

        t1.start();
        t2.start();

        System.arraycopy(secondTestArray, 0, testArray, 0, HALF);
        System.arraycopy(thirdTestArray, 0, testArray, HALF, HALF);

        System.out.println("Time2 = " + (System.currentTimeMillis() - a));
    }

    private static float[] createArray(int size) {
        float[] testArray = new float[size];
        for (int i = 0; i < size; i++) {
            testArray[i] = 1;
        }
        return testArray;
    }

    private static void arrFormula(float[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = (float) (someArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}
