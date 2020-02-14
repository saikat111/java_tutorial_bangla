import java.util.Scanner;
class Input{
	public static void main(String args[]){
	int num1,num2,sum;
	Scanner obj = new Scanner(System.in);
	num1 = obj.nextInt();
	num2 = obj.nextInt();
	sum = num1 + num2;
	System.out.println("The sum is :" + sum);

}
}