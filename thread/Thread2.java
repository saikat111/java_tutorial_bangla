public class Thread2 extends Thread {
    public void run(){
        for (int i =1;i<=5; i++){
            System.out.println("Value of I="+  i + " Thread name = "+Thread.currentThread().getName() + " Thread ID = " + Thread.currentThread().getId());
        }
    }
    public  static  void main(String args[]){
        Thread2 th2 = new Thread2();
        Thread2 th3 = new Thread2();
        Thread2 th4 = new Thread2();
        th2.start();
        th3.start();
        th4.start();
    }
}
