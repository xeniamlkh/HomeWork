package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Luther");
        Plate plate = new Plate(10);

        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Pushok");
        catArray[1] = new Cat("Barsik");
        catArray[2] = new Cat("Vasya");
        catArray[3] = new Cat("Milok");
        catArray[4] = new Cat("Malysh");
        Plate plate2 = new Plate(20);

        plate.printInfo();
        System.out.println();

        while (plate.getFoodCount() > 0) {
            System.out.println(cat.name);
            cat.eat(plate);
            plate.printInfo();
            System.out.println();
        }

        plate2.printInfo();
        System.out.println();

        for (int i = 0; i < catArray.length; i++) {
            System.out.println(catArray[i].name);
            catArray[i].eat(plate2);
            plate2.printInfo();
            System.out.println();
        }

        plate2.printInfo();
        System.out.println("Adding some food...");
        plate2.increaseFood(5);
        plate2.printInfo();
    }
}
