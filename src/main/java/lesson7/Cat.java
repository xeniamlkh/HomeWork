package lesson7;

import java.util.Random;

public class Cat {
    Random random = new Random();

    public String name;
    public boolean bellyful;

    public Cat(String name) {
        this.name = name;
        bellyful = false;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(random.nextInt(15) + 1);
    }
}
