import  java.util.Scanner;
public class Exception {
    public  static  void  main(String args []) {
      /*
      demo code for exception

             */
        int a ;
        int b ;
        int r;
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        try{
            r = a/b;
            System.out.println(r);
        }
        catch (ArithmeticException e) {
            System.out.println("Error");
        }
    }
}
