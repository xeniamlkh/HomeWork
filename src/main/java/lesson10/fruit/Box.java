package lesson10.fruit;

public class Box<E> {

    private E[] data; //?
    private static final int DEFAULT_SIZE = 20;
    private int currentSize;

    public Box(int size) {
        this.data = (E[]) new Object[size];
        currentSize = 0;
    }

    public Box() {
        this(DEFAULT_SIZE);
    }

    public void add(E value) {
        add(value, currentSize);
    }

    private void add(E value, int index) {
        data[index] = value;
        currentSize++;
    }

    public E get(int index) {
        return data[index];
    }

    public void remove(int index) {
        data[index] = null;
        currentSize--;
    }

    public int returnCapacity() {
        return data.length;
    }

    public float getWeight(float weight) {
        return currentSize * weight;
    }

    public boolean compare(float anotherBoxWeight, float weight) {
        if (anotherBoxWeight != currentSize * weight) {
            return false;
        }
        return true;
    }

    public void moveFruits(Box<Fruit> Box, Box<Fruit> BoxTwo, float weight) {
        if (BoxTwo.returnCapacity() >= Box.returnCapacity()) {
            for (int i = 0; i < Box.returnCapacity(); i++) {
                BoxTwo.add(Box.get(i));
                Box.remove(i);
            }
        } else {
            System.out.println("Box Two capacity is less than Box One capacity! Fruits can't be moved! There is not enough space!");
        }
        System.out.println("Box Two weight after moving fruits = " + BoxTwo.getWeight(weight));
        System.out.println("Box One weight after moving fruits = " + Box.getWeight(weight));
    }

}
