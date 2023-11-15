def toBinary(n):
    binary = ""
    while n > 1 :
        rem = n % 2
        binary = str(rem) + binary
        n = n//2
    return "1"+binary
