import java.util.*;
public class HighFreqElement{
	public static int maxFrequency(int[] inputArr){
    //Hashmap to store elem and its frequency
		HashMap<Integer,Integer> freqMap = new HashMap<>();

    //Traversing inputArr to count the frequency
		for(int i=0; i<inputArr.length;i++){
			int currentElem=inputArr[i];
			freqMap.put(currentElem, freqMap.getOrDefault(currentElem,0 )+1);
		}
		
		int maxFreq = 0;
		int maxFreqElem = -1;

    //Traversing the hashmap to findout maximum frequency and element
		for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){ 
			int elem = entry.getKey();
			int freq =  entry.getValue();
			
			if(freq>maxFreq){
				maxFreq = freq;
				maxFreqElem = elem;
			}
		}
		return maxFreqElem;
		
	}
	
	 public static void main(String[] args) {
	      int[] arr = {101,20,101,101,20,1};
	      int ans = maxFrequency(arr);
	      System.out.println("element which have high frequency is " + ans);
	      
	   }
}
