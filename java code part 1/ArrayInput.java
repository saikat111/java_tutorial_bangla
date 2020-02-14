import  java.util.Scanner;
public class ArrayInput {
    public  static  void  main(String args []) {
        int[] a = new int[5];
        Scanner obj = new Scanner(System.in);
        for (int i= 0; i<5;i++){
            a[i] = obj.nextInt();
        }
        for(int i =0; i< a.length; i++){
            System.out.println("Arry value :" + a[i]);
        }


    }
}
