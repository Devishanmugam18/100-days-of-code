class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        dict=defaultdict(int)
        max_occur = 0
        for i, num in enumerate(arr):
            dict[num]+=1
            if dict[num] > max_occur:
                max_occur=dict[num]
                ind = i
        return arr[ind]

