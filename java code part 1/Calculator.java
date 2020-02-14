import  java.util.Scanner;
class Calculator {
    public  static void main(String args[]) {
        String op;
        int a, b, result;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the operator:");
        op = obj.nextLine();
        System.out.println("Enter number one:");
        a = obj.nextInt();
        System.out.println("Enter the 2nd number:");
        b = obj.nextInt();
        switch (op){
            case "+":
                result = a+b;
                System.out.println( "The sum is :" + result);
                break;
            case "-":
               result = a -b;
                System.out.println(" - :" + result);
                break;
            case "*":
                result = a *b;
                System.out.println(" * :" + result);
                break;
            case "/":
                result = a /b;
                System.out.println(" / :" + result);

        }
    }
}
