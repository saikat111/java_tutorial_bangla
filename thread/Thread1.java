public class Thread1 extends  Thread {
    public  void run(){
        System.out.println("Thread start..." + "\n" + Thread.currentThread().getName() + "\n" + Thread.currentThread().getId());
    }
    public  static  void main(String args[]){
        Thread1 th = new Thread1();
        th.start();
    }
}
