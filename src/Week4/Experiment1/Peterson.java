package Week4.Experiment1;

public class Peterson {
    public static void main(String args []) throws Exception {

        MyThread.count = 0 ;

        MyThread thread1 = new MyThread() ;
        thread1.name = "A" ;

        MyThread thread2 = new MyThread() ;
        thread2.name = "B" ;

        thread1.start() ;
        thread2.start() ;

        thread2.join() ;
        thread1.join() ;

        System.out.println("MyThread.count = " + MyThread.count) ;
    }
}
