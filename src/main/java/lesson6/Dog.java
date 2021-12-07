package lesson6;

public class Dog extends Animal {

    private static int count;

    public Dog() {
        count++;
    }

    public boolean run(int distance) {
        return super.run(distance, 500);
    }

    public boolean run(int distance, int limit) {
        return super.run(distance, limit);
    }

    public boolean swim(int distance) {
        return super.swim(distance, 10);
    }

    public boolean swim(int distance, int limit) {
        return super.swim(distance, limit);
    }

    @Override
    public String toString() {
        return String.format("A total number of dogs = " + count);
    }
}