package lesson14;

public class ExerciseSeven {

    public static void main(String[] args) {
        int[] arrCheck = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("TASK 7: " + compareMethod(arrCheck));
    }

    public static boolean compareMethod(int[] arrCheck) {
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
}
