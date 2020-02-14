import java.util.Scanner;
class IfElseL{
	public static void main(String args[]){
	int a,b;
	Scanner obj = new Scanner(System.in);
	a = obj.nextInt();
	b = obj.nextInt();
	if(a > 5){
		System.out.println(a);
		if(b > 10){
			System.out.println(b);
		}
		else if(b < 10){
			System.out.println(b);
			}
			if(b > 20){
			System.out.println(b);
		}
	}
	else if(a < 5){
		System.out.println(a);
		}
	else{
		System.out.println("Error");
	}
	}	
}