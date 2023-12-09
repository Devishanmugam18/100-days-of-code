class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if target in nums:
            for i,num in enumerate(nums):
                if target == num:
                    return i
        else:
            for i in range(len(nums)-1):
                if (target>nums[i] and target < nums[i+1]):
                    return i+1 
        return len(nums)                
