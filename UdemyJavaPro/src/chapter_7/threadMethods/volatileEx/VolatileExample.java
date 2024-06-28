package chapter_7.threadMethods.volatileEx;

public class VolatileExample extends Thread {

    boolean b = true;

    public void run(){
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finished counter = " + counter);
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileExample thread = new VolatileExample();
        thread.start();
        thread.sleep(3000);
        System.out.println("After 3 second it is time wake up!");
        thread.b = false;
        thread.join();
        System.out.println("End of program");
    }
}
