public class ArraySortedChecker {
	public static boolean isSorted(int[] array){
		for(int i=0; i<array.length-1;i++){ 
			if(array[i] > array[i+1]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		int[] array={1,2,7,4,5};
		System.out.println("Is array sorted?" + isSorted(array));
	}
}
