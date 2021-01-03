package Week4.Experiment6;

public class MyThread extends Thread {
    static volatile int count ;

    String name ;

    public void run() {

        for(int i = 0 ; i < 100000000 ; i++) {
            count++;
        }
    }
}