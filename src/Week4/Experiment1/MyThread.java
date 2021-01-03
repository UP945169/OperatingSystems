package Week4.Experiment1;


class MyThread extends Thread {

    volatile static int count ;

    volatile static boolean lock = false ;

    String name ;

    public void run() {

        for(int i = 0 ; i < 10 ; i++) {
            delay() ;

            while(lock) {}  // wait until lock is false
            lock = true ;   // claim access to critical region

            // start of critical section
            int x = count ;
            System.out.println("Thread " + name + " read " + x) ;
            delay() ;
            count = x + 1 ;
            System.out.println("Thread " + name + " wrote " + (x + 1)) ;
            // end of critical section

            lock = false ;  // release access to critical region
        }
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
