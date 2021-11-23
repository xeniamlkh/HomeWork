package lesson6;

public abstract class Animal {

    public boolean run(int distance, int limit) {

        if (distance < 0) {
            throw new ArithmeticException("A distance can not be a negative number");
        } else if (distance < limit) {
            return true;
        } else {
            return false;
        }
    }

    public boolean swim(int distance, int limit) {

        if (distance < 0) {
            throw new ArithmeticException("A distance can not be a negative number");
        } else if (distance < limit) {
            return true;
        } else {
            return false;
        }
    }

}