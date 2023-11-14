class Solution:
    def countPrimes(self, n: int) -> int:

        if n <= 2:
            return 0
        
        # Step 1 - mark all numbers are prime
        is_prime = [True] * n
        
        # Step 2 - marking 0 and 1 are non prime
        is_prime[0] = is_prime[1] = False
        
        # Step 3 - finding prime from 2 to sqrt(n)
        for i in range(2, int(n**0.5)+1):
            if is_prime[i]:
#marking multiples of each i as 'false' which is a composite number
                for j in range(i*i, n, i):
                    is_prime[j] = False
        
# Step 4 - index which are remain 'True' are prime number
        return sum(is_prime)
