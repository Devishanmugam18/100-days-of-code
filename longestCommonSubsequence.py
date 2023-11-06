class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        
    # Construct dp matrix
        n, m = len(text1), len(text2)
        dp = [[0]*(n+1) for _ in range(m+1)]
   
    # Iterate over each cell and update length of subsequence at every posssible combination
        for i in range(1,m+1):
            for j in range(1,n+1):
                if text1[j-1] == text2[i-1]:
                    dp[i][j] = 1 + dp[i-1][j-1]
                else:
                    dp[i][j] = max(dp[i-1][j],dp[i][j-1])    
       
    # Return the value in the last cell
        return dp[m][n]
        
