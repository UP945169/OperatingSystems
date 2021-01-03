package Week4.Experiment4;

import java.util.concurrent.*;

class MyThread extends Thread {

    volatile static int count ;

    static Semaphore mySemaphore = new Semaphore(1);

    String name ;

    public void run() {
        try {

            for(int i = 0 ; i < 10 ; i++) {
                delay() ;

                mySemaphore.acquire() ;  // P - decrease semaphore

                int x = count ;
                System.out.println("Thread " + name + " read " + x) ;
                delay() ;
                count = x + 1 ;
                System.out.println("Thread " + name + " wrote " + (x + 1)) ;

                mySemaphore.release() ;  // V - increase semaphore
            }

        }
        catch(Exception e) {}
    }

    void delay() {

        int delay = (int) (1000 * Math.random()) ;
        try {
            Thread.sleep(delay) ;
        }
        catch(Exception e) {
        }
    }
}
