class Solution:
    def fib(self, n: int) -> int:
        if n == 0:
            return 0
        elif n == 1:
            return 1

        cache = [0] * (n+1)
        cache[1] = 1
        for i in range(2, n+1):
            cache[i] = cache [i-1] + cache[i-2]

        return cache[-1]
