	public class StockBuyAndSell {
		
	public static int findMaxProfit(int[] a){
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			minPrice = Math.min(minPrice, a[i]);
			maxProfit=Math.max(maxProfit, a[i]-minPrice);
		}
	
		return maxProfit;
	}
	public static void main(String[] args){
		int[] arr={7,1,3,5,6,4};
		int maxProfit = findMaxProfit(arr);
		System.out.println("Maximum profit is "+maxProfit);
	}
	}
