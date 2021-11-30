package lesson8;

public class Person extends Participants implements Runner, Jumper{
    int maxDistance;
    int maxJumpHeight;

    public Person() {
        maxDistance = 4000;
        maxJumpHeight = 2;
    }

    @Override
    public void jump() {
        System.out.printf("The man has successfully jump over the wall %n");
    }

    @Override
    public void run() {
        System.out.printf("The man has successfully run the distance %n");
    }

    public void printInfo() {
        System.out.printf("The man's maximum distance is %dm; the man's maximum jump height is %dm %n", maxDistance, maxJumpHeight);
    }

}
