import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		calc();
	}
	private static void calc(){
		int ans=0;
		Scanner scan = new Scanner(System.in);
    //take input from user untill user press e or E
		while(true){
			System.out.println("Enter the operator");
    //take input as operator
			char operator = scan.next().trim().charAt(0);
			
			if(operator == '+' || operator == '-' || operator == '/' || operator == '%'|| operator == '*'){
				System.out.println("Enter two numbers");  
  //input two numbers
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				
				if(operator == '+'){
					 ans=num1+num2;
				}
				if(operator == '-'){
					 ans=num1-num2;
				}
				if(operator == '*'){
					 ans=num1*num2;
				}
				if(operator == '/'){
					if(num2!=0){
				    ans=num1/num2;
					}
					else{
						System.out.println("divide by zero error");
					}
				}
				if(operator == '%'){
					ans=num1%num2;
					
				}
				
			}
		
			else if (operator=='e'|| operator=='E'){
			System.out.println("Exited");
			break;
		}
			else{
				System.out.println("Invalid operator!!");
			}
			System.out.println(ans);
	}
	}
}
