class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        i = 0
        powOfThree = 0
        while powOfThree < n:
            powOfThree = 3**i
            i +=1
            if powOfThree == n:
                return True
                  
        return False    
