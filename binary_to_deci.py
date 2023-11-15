class Solution:
	def binary_to_decimal(self, str):
	    power = -1
	    decimal = 0
		for i in range(len(str)-1, -1, -1):
		    power += 1
		    if str[i] == '1':
		        decimal += 2 ** power
		return decimal  
