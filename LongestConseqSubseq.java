import java.util.*;

public class LongestConseqSubseq {
static int findLongestConseqSubseq(int[] arr){
	Set<Integer> hashSet = new HashSet<Integer>();
	for(int num : arr){
		hashSet.add(num);
}
	int longestStreak=0;
	for(int num:arr){
		if(!hashSet.contains(num-1)){ //finding initial point of the sequence
			int initNum = num;
			int currentStreak = 1;
			
			while(hashSet.contains(initNum+1)){ //Keep on iterating untill the consecutive check fails
				currentStreak++;
				initNum++;
			}
			longestStreak = Math.max(longestStreak, currentStreak); // maintaining the maximum streak
		}	
	}
	return longestStreak;
}
	public static void main(String[] args) {
		int[] arr={3,8,5,7,6};
		int ans = findLongestConseqSubseq(arr);
		System.out.println("The longest consecutive sequence is "+ ans);	
	}
}
