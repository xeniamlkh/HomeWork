package lesson9;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j, String myArr) {
        super(String.format("The symbol/string %s [%d, %d] can't be converted to an integer!%n", myArr, i, j));
    }
}
