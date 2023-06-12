public class TransitionPoint {
public static int transitionPoint(int[] arr){
	int len = arr.length;
	int start = 0;
	int end = len-1;
	while(start <= end){
		int mid = (start + end)/2;
		if(arr[mid] == 1 && arr[mid-1] == 0){
			return mid;
		}
		else if (arr[mid] == 1){
			end = mid - 1;
		}
		else{
			start = mid + 1;
		}
	}
	return -1;
}
	public static void main(String[] args){
		int[] arr = {0,0,0,1,1};
		int index = transitionPoint(arr);
		System.out.println(index);
	}
}
