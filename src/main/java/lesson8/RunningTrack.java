package lesson8;

public class RunningTrack {
    int runningTrackDistance;

    public RunningTrack() {
        runningTrackDistance = (int) (Math.random() * 10001 + 500);
    }

    public void runningTrackInfo() {
        System.out.printf("The running track has a distance = %dm %n", runningTrackDistance);
    }

    public boolean run(Cat cat) {
        cat.printInfo();
        runningTrackInfo();

        if (runningTrackDistance >= 0 && runningTrackDistance <= 2000) {
            cat.run();
        } else {
            System.out.printf("A cat can't run that far. The cat failed this task %n");
            return false;
        }
        return true;
    }

    public boolean run(Person person) {
        person.printInfo();
        runningTrackInfo();

        if (runningTrackDistance >= 0 && runningTrackDistance <= 4000) {
            person.run();
        } else {
            System.out.printf("A man can't run that far. The man failed this task %n");
            return false;
        }
        return true;
    }

    public boolean run(Robot robot) {
        robot.printInfo();
        runningTrackInfo();

        if (runningTrackDistance >= 0 && runningTrackDistance <= 8000) {
            robot.run();
        } else {
            System.out.printf("A robot can't run that far. The robot failed this task %n");
            return false;
        }
        return true;
    }
}
