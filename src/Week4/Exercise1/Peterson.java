package Week4.Exercise1;

public class Peterson {

    public static void main(String args []) throws Exception {

        MyThread.count = 0 ;

        MyThread thread1 = new MyThread() ;
        thread1.name = "A" ;
        thread1.id = 0 ;

        MyThread thread2 = new MyThread() ;
        thread2.name = "B" ;
        thread2.id = 1 ;

        thread1.start() ;
        thread2.start() ;

        thread1.join() ;
        thread2.join() ;

        System.out.println("MyThread.count = " + MyThread.count) ;
    }
}
