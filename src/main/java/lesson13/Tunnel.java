package lesson13;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    Semaphore smp;

    public Tunnel() {
        this.length = 80;
        this.description = length + " m";
        this.smp = new Semaphore(2);
    }

    @Override
    public void go(Car c, int i) {
        try {
            try {
                System.out.println(c.getName() + " is waiting to go to the TUNNEL: " + description);
                smp.acquire();
                System.out.println(c.getName() + " has entered the TUNNEL: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " has left the TUNNEL: " + description);
                smp.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
