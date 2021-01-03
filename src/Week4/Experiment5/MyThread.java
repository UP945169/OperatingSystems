package Week4.Experiment5;

public class MyThread extends Thread{
    static volatile int count ;

    String name ;

    public void run() {

        for(int i = 0 ; i < 100000000 ; i++) {
            increment() ;
        }
    }

    synchronized static void increment() {
        int x = count ;
        count = x + 1 ;
    }
}
