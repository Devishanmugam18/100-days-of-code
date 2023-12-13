class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        n=len(nums)
        def count(list):
            s=set(list)
            return len(s)**2
        res=0
        for i in range(n):
            for j in range(i+1,n+1):
                res += count(nums[i:j])
        return res                


        
