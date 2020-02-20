public class Thread6 extends  Thread {
    public  void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
    public  static  void main(String args[]){
        Thread6 th = new Thread6();
        Thread6 th2 = new Thread6();
        Thread6 th3 = new Thread6();
        th.setPriority(MAX_PRIORITY);
        th2.setPriority(MIN_PRIORITY);
        th.start();
        th2.start();
        th3.start();



    }
}
