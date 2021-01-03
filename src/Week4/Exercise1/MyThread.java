package Week4.Exercise1;

public class MyThread extends Thread{
          volatile static int count ;

      String name ;
      int id ;

      public void run() {

          for(int i = 0 ; i < 10 ; i++) {
              delay() ;

              beginCriticalSection() ;

              int x = count ;
              System.out.println("Thread " + name + " read " + x) ;
//            delay() ;
              count = x + 1 ;
              System.out.println("Thread " + name + " wrote " + (x + 1)) ;

              endCriticalSection() ;
          }
      }

      // Peterson's algorithm

      volatile static int turn ;
      volatile static boolean [] interested = new boolean [2] ;

      void beginCriticalSection() {
          interested [id] = true ;
          int jd = 1 - id ;
          turn = jd ;
          while(interested [jd] & turn == jd) {

          }
      }

      void endCriticalSection() {
          interested [id] = false ;
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
