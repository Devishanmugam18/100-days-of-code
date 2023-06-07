package Arrays_easy;

public class MatrixSearch {
	
	    public static boolean search(int[][] matrix, int target) {
	        int lo = 0;
	        if(matrix.length == 0) return false;
	        int n = matrix.length; 
	        int m = matrix[0].length; 
	        int hi = (n * m) - 1;
	        
	        while(lo <= hi) {
	            int mid = (lo + (hi - lo) / 2);
	            if(matrix[mid/m][mid % m] == target) {
	                return true;
	            }
	            if(matrix[mid/m][mid % m] < target) {
	                lo = mid + 1;
	            }
	            else {
	                hi = mid - 1;
	            }
	        }
	        return false;
	    }
	
	public static void main(String[] args) {
		int target=19;
		
		int[][] arr={{1,3,5,7},{10,11,24,16},{18,19,20,21}};
		boolean isFound = search(arr,target);
		System.out.println(isFound);
	    
	}
}
