class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
      count = 0
      sum_so_far = 0
      hashmap = {0: 1}

      for n in nums:
        sum_so_far += n
        diff = sum_so_far - k
         
        count += hashmap.get(diff, 0)
        hashmap[sum_so_far] = hashmap.get(sum_so_far, 0) + 1

      return count
