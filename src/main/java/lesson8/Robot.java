package lesson8;

public class Robot extends Participants implements Runner, Jumper{
    int maxDistance;
    int maxJumpHeight;

    public Robot() {
        maxDistance = 8000;
        maxJumpHeight = 4;
    }

    @Override
    public void jump() {
        System.out.printf("The robot has successfully jump over the wall %n");
    }

    @Override
    public void run() {
        System.out.printf("The robot has successfully run a distance %n");
    }

    public void printInfo() {
        System.out.printf("The robot's maximum distance is %dm; the robot's maximum jump height is %dm %n", maxDistance, maxJumpHeight);
    }
}
