package lesson10.fruit;

public class Main {

    public static void main(String[] args) {

        Box<Fruit> appleBox = new Box<>((int) (Math.random() * 11) + 10);
        Box<Fruit> orangeBox = new Box<>((int) (Math.random() * 11) + 10);

        Apple apple = new Apple();
        Orange orange = new Orange();

        fillBoxesWithFruits(appleBox, orangeBox);

        System.out.println("Apple Box One capacity = " + appleBox.returnCapacity());
        System.out.println("Apple Box One weight = " + appleBox.getWeight(apple.weight));
        System.out.println("Orange Box One capacity = " + orangeBox.returnCapacity());
        System.out.println("Orange Box One weight = " + orangeBox.getWeight(orange.weight));

        System.out.println("Does the apple box weight the same as the orange box? " + appleBox.compare(orangeBox.getWeight(orange.weight), apple.weight));

        Box<Fruit> appleBoxTwo = new Box<>((int) (Math.random() * 11) + 10);
        Box<Fruit> orangeBoxTwo = new Box<>((int) (Math.random() * 11) + 10);

        System.out.println("Moving apples from the Box One to the Box Two...");
        System.out.println("Apple Box Two capacity = "  + appleBoxTwo.returnCapacity());
        appleBox.moveFruits(appleBox, appleBoxTwo, apple.weight);
        System.out.println("Moving oranges from the Box One to the Box Two...");
        System.out.println("Orange Bow Two capacity = " + orangeBoxTwo.returnCapacity());
        orangeBoxTwo.moveFruits(orangeBox, orangeBoxTwo, orange.weight);

    }

    private static void fillBoxesWithFruits(Box<Fruit> appleBox, Box<Fruit> orangeBox) {
        for (int i = 0; i < appleBox.returnCapacity(); i++) {
            appleBox.add(new Apple());
        }
        for (int i = 0; i < orangeBox.returnCapacity(); i++) {
            orangeBox.add(new Orange());
        }
    }
}
