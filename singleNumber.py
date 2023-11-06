class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        res = 0 ;
        for num in nums:
          # Do xor with each element, will result in non repeating number
          res = res ^ num 
        return res 
