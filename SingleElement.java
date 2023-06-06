import java.util.*;

public class SingleElement {
public static int singleElementFinder(int[] arr){
	HashMap<Integer,Integer> hash =  new HashMap<>();
	
	for(int i = 0; i < arr.length; i++){
		int value = hash.getOrDefault(arr[i], 0);
		hash.put(arr[i], value+1);
	}
  
	for(Map.Entry<Integer, Integer> it:hash.entrySet()){
		if(it.getValue() == 1){
			return it.getKey();
		}	
	}
	return -1;
}
public static void main(String[] args) {
	int[] arr = {4,1,2,1,2};
	int ans = singleElementFinder(arr);
	System.out.println(ans);
	}
}
