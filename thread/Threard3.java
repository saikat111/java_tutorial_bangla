class Thread3 extends Thread {
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
        try{
            th2.join(5000);

        }
        catch (Exception e){
            System.out.println(e);
        }
        th3.start();
        try{
            th3.join(5000);
        }
        catch (Exception e){
            System.out.println(e);
        }

        th4.start();
    }
}
