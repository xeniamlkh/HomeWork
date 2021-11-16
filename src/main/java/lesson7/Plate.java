package lesson7;

public class Plate {

    public int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println("Remaining amount of food: " + foodCount);
    }

    public void decreaseFood(int catEatFoodCount) {
        if (foodCount - catEatFoodCount < 0) {
            System.out.printf("Not enough food! Our cat want to eat %d pieces%n", catEatFoodCount);
            System.out.println("Our cat remains hungry!");
        } else {
            System.out.printf("Our cat has eaten %d pieces%n", catEatFoodCount);
            foodCount -= catEatFoodCount;
            System.out.println("Is our cat full? " + returnBellyful());
        }
    }

    public void increaseFood(int foodFromPack) {
        foodCount += foodFromPack;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public boolean returnBellyful(){
        return true;
    }
}
