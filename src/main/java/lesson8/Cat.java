package lesson8;

public class Cat extends Participants implements Runner, Jumper {
    int maxDistance;
    int maxJumpHeight;

    public Cat() {
        maxDistance = 2000;
        maxJumpHeight = 3;
    }

    @Override
    public void jump() {
        System.out.printf("The cat has successfully jump over the wall %n");
    }

    @Override
    public void run() {
        System.out.printf("The cat has successfully run the distance %n");
    }

    public void printInfo() {
        System.out.printf("The cat's maximum distance is %dm; the cat's maximum jump height is %dm %n", maxDistance, maxJumpHeight);
    }
}
