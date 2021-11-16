package lesson8;

public class Wall {
    int wallHeight;

    public Wall() {
        wallHeight = (int) (Math.random() * 7 + 1);
    }

    public void wallHeight() {
        System.out.printf("The wall is %dm high %n", wallHeight);
    }

    public void jump(Cat cat) {
        wallHeight();
        if (wallHeight >= 0 && wallHeight <= 3) {
            cat.jump();
        } else {
            System.out.printf("A cat can't jump so high. The cat failed this task %n");
        }
    }

    public void jump(Person person) {
        wallHeight();
        if (wallHeight >= 0 && wallHeight <= 2) {
            person.jump();
        } else {
            System.out.printf("A man can't jump so high. The man failed this task %n");
        }
    }

    public void jump(Robot robot) {
        wallHeight();
        if (wallHeight >= 0 && wallHeight <= 4) {
            robot.jump();
        } else {
            System.out.printf("A robot can't jump so high. The robot failed this task %n");
        }
    }

}
