public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
		int max=0;
		for(int i  = 0; i<nums.length;i++){
			if(nums[i]==1){
				count++;
			}
			else{
				if(max<count){
				max=count;
				}
				count=0;
			}
		}
		if(max<count){
			return count;
		}
		else{
			return max;
		}
	}
    public static void main(String[] args) {
    		int a[] ={1,1,0,1,1,1};
    		int ans = findMaxConsecutiveOnes(a);
    		System.out.println(ans);
	}
}
    
