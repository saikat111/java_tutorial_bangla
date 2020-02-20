class Thread4 extends Thread {
    public void run(){
        for (int i =1;i<=5; i++){
            System.out.println(i);

           try{
               Thread.sleep(2000);

           }
           catch (Exception e){
               System.out.println(e);
           }

        }
    }
    public  static  void main(String args[]){
        Thread4 th2 = new Thread4();
       // Thread2 th3 = new Thread2();
       // Thread2 th4 = new Thread2();
        th2.start();

    }
}
