class Solution:
    def fib(self, n: int) -> int:
        one_before = 1
        two_before = 0
        total = 0
        if n == 1:
            return 1
        for i in range(2,n+1):
            total = two_before + one_before
            two_before = one_before
            one_before = total
        return total    
           
