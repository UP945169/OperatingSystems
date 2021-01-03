package Week4.Exercise2;

public class MyThread extends Thread{
    volatile static Queue q ;

      String name ;

      public void run() {

          for(int i = 0 ; i < 1000000 ; i++) {
              q.add("message " + i) ;
              System.out.println("Thread " + name +
                                 " added message " + i) ;
          }
      }
}
