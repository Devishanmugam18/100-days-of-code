def generate_n_primes(n):
    list_prime = []
    count = 0
    num = 2

    while count < n:
        prime = True
        for i in range(2, int(num ** 0.5) + 1):
            if num % i == 0:
                prime = False
                break
        if prime:
            list_prime.append(num)
            count += 1
        num += 1

    return list_prime

n = 10
result = generate_n_primes(n)
print(f"The first {n} prime numbers are: {result}")
     
          
      
      
