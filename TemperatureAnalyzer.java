public class TemperatureAnalyzer {
	static int findLargestMarginIndex(int[] arr){
		int largestMarginIndex = 0;
		int largestMargin = 0;
		
		for(int i = 1; i < arr.length; i++){
			int margin = arr[i] - arr[i - 1];
			if(margin > largestMargin){
				largestMargin = margin;
				largestMarginIndex = i;
			}
		}
		return largestMarginIndex + 1;
		
	}
	public static void main(String[] args) {
		int[] temperatures =  {23, 25, 35, 24, 28, 22, 20};
		int largestMarginIndex = findLargestMarginIndex(temperatures);
		System.out.println("largest temperature increses on day " + largestMarginIndex);
	}

}
