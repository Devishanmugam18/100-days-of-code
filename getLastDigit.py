#User function Template for python3

class Solution:
    def getLastDigit(self, a, b):
        
        # Convert strings to integers
        a = int(a)
        b = int(b)

        # Calculate last digit of a^b
        if b == 0:
            return 1  # Any number raised to the power of 0 is 1

        # Possible last digit of powers of numbers from 0 to 9
        last_digit_powers = {
            0: [0],
            1: [1],
            2: [2, 4, 8, 6],
            3: [3, 9, 7, 1],
            4: [4, 6],
            5: [5],
            6: [6],
            7: [7, 9, 3, 1],
            8: [8, 4, 2, 6],
            9: [9, 1]
        }

        last_digit_cycle = last_digit_powers[a % 10]
        cycle_length = len(last_digit_cycle)

        # Find the position in the cycle by taking remainder of 'b' divided by cycle length
        position = (b - 1) % cycle_length

        return last_digit_cycle[position]
