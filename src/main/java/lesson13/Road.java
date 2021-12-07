package lesson13;

import java.util.concurrent.CountDownLatch;

public class Road extends Stage {

    CountDownLatch cdl;

    public Road(int length, CountDownLatch cdl) {
        this.length = length;
        this.description = length + " m";
        this.cdl = cdl;
    }

    @Override
    public void go(Car c, int i) {
        try {
            System.out.println(c.getName() + " has started a TRACK: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
            System.out.println(c.getName() + " has finished a TRACK: " + description);
            cdl.countDown();
            if (i == 2 && cdl.getCount() == 3) {
                System.out.println(c.getName() + " WIN!!!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
