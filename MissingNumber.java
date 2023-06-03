public class MissingNumber {
	static int findMissingNumber(int arr[], int N){
		 int default_sum=(N*(N+1)/2);
	    int arrSum = 0;
	     for(int i = 0 ; i < arr.length; i++) {
	        arrSum += arr[i];
	      }
	     return default_sum - arrSum;
	      
	   }
		
		public static void main(String[] args) {
		      int arr[]={1,2,3,5};
		      int N=5;
		      int ans = findMissingNumber(arr,N);
		      System.out.println(ans);
		     		      
  }

}
