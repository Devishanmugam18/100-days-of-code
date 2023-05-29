public class LeftRotateArray {
	public static void main(String[] args){
		int[] arr={1,2,3,4,5};
		leftRotateByOne(arr);
		for(int x:arr){
			System.out.print(x+" ");
		}
	}
	static void leftRotateByOne(int[] arr){
	int n = arr.length;
	int temp = arr[0];
	for(int i=1; i<n; i++){
		arr[i-1] = arr[i];
	}
	arr[n-1] = temp;
}
}
