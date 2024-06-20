package work.volatileEx;

import java.awt.image.ConvolveOp;
import java.awt.image.VolatileImage;

public class VolatileExample extends Thread {
    volatile boolean v = true;

    public void run(){
        long counter = 0;
        while (v){
            counter++;
        }
        System.out.println("Loop is finished counter = " + counter);
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileExample vo = new VolatileExample();
        vo.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up");
        vo.v = false;
        vo.join();
        System.out.println("End of program");
    }
}
