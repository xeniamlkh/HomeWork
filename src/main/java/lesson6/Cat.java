package lesson6;

public class Cat extends Animal {

    private static int count;

    public Cat(){
        count++;
    }

    public boolean run(int distance) {
        return super.run(distance, 200);
    }

    public boolean run(int distance, int limit) {
        return super.run(distance, limit);
    }

    public boolean swim(int distance) {
        return super.swim(distance, 0);
    }

    public boolean swim(int distance, int limit) {
        return super.swim(distance, 0);
    }

    @Override
    public String toString() {
        return String.format("A total number of cats = " + count);
    }
}