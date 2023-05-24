import java.util.Scanner;

public class Factorial {
public static void main(String []args){
	System.out.println("Enter any number");
	Scanner scan = new Scanner(System.in);
	long num  = scan.nextInt();

	long ans = 0;
	for(long i = num-1; i >= 2; i--){
		num *= i;
	}
 	System.out.println("Factorial of " + "num is " + num);
}
}
