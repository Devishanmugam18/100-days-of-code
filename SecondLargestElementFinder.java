public class SecondLargestElementFinder {
	public static int findSecondLargest(int[] arr){
	 int largest = Integer.MIN_VALUE;
	 int second_largest = Integer.MIN_VALUE;
	 for(int i=0;i<arr.length;i++){
		 if(arr[i] > largest){
			 second_largest = largest;
			 largest = arr[i];
		 }
		 else if(arr[i] > second_largest && arr[i] != largest){
			 second_largest = arr[i];
		 }
	 }
	 return second_largest;
		
		
	}
	public static void main(String[] args){
		int[] arr = {3,6,1,4,7};
		int second_largest = findSecondLargest(arr);
		System.out.println("The second_largest element int the array is " + second_largest);
	}

}
