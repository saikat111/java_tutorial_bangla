public class Thread5 extends  Thread {
    public  void run(){
        System.out.println("Thread name = " + Thread.currentThread().getName() + Thread.currentThread().getId());
        Thread.currentThread().setName("Demo");
        System.out.println("Thread name = " + Thread.currentThread().getName() + Thread.currentThread().getId());
        Thread.currentThread().setName("Demo2");
          System.out.println("Thread name = " + Thread.currentThread().getName() + Thread.currentThread().getId());
    }
    public  static  void main(String args[]){
        Thread5 th = new Thread5();
        th.start();



    }
}
