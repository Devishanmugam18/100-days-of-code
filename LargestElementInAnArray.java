import java.util.Scanner;

public class LargestElementInAnArray {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
    System.out.println("Enter the array length");
		int length = scan.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the array elements");
	    for(int i=0; i<length;i++){
	    	arr[i] = scan.nextInt();
	    }
		
		int largest=arr[0];
		for(int i=1; i<arr.length;i++){
			if(largest < arr[i] ){
				largest=arr[i];
			}
		}

		System.out.println("Largest elemenet in a array is " +largest);

}
}
