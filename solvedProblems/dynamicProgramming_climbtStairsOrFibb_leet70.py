class Solution:
    def climbStairs(self, n: int) -> int:
        cache = [0] * (n + 1)
        cache[0], cache[1] = 1,1

        for i in range(2,n+1):
            cache[i] = cache[i-1] + cache[i-2]

        return cache[-1]

# https://www.youtube.com/watch?v=dDSSCP-mtuQ&feature=youtu.be
