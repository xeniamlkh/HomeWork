package lesson8;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Cat cat = new Cat();
        Robot robot = new Robot();

        RunningTrack runningTrack = new RunningTrack();
        Wall wall = new Wall();

        Participants[] participants = {cat, person, robot};
        //       Challenge[] challenge = {runningTrack, wall};

        for (Participants participant : participants) {
            if (participant == cat) {
                if (runningTrack.run(cat) == false) {
                    System.out.println("The cat won't continue to do challenges");
                } else {
                    wall.jump(cat);
                }
                System.out.println();
            } else if (participant == person) {
                if (runningTrack.run(person) == false) {
                    System.out.println("The man won't continue to do challenges");
                } else {
                    wall.jump(person);
                }
                System.out.println();
            } else if (participant == robot) {
                if (runningTrack.run(robot) == false) {
                    System.out.println("The robot won't continue to do challenges");
                } else {
                    wall.jump(robot);
                }
                System.out.println();
            }

        }

    }

}
