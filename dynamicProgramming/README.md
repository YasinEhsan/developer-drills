# Dynamic Programming
Problems and notes on sub-topic dynamic programming or DP.

## Common Problems
1. Fibonacci (Classic)
2. Knapsack (Amazon Truck problem)

## Basics
- Always thought that recursion was dope stuff but it isn't
- DP is an optimization for many recursive, brute-force solutions
- DP problems appear as: need to calculate all combinations / work from prev. steps (Recursion) / find minimum path or cost
- DP is to optimize and do less work say if procastination monkey knew how to code
- We optimize by breaking the problem into subproblems and saving past computations so we don't have to redo them
- two ways of approaching DP problems : Tabulation and Memoization

Tabulation | Memoization
--- | ---
bottom-up | top-down
"I have to train to win." | "To win, I have to train."
Better speed by constant | Better space by constant
Easier to grasp; read from table | More complex with recursive call
All entires to dp[n] are filled | Only entries / subproblems that are needed are filled therefore better space




## Questions

## Snippets
```Java
//TABULATION
int dp[MAXN];

// base case
int dp[0] = 1;
for (int i = 1; i< =n; i++)
{
    dp[i] = dp[i-1] * i;
}

//MEMOIZATION
// initialized to -1
int dp[MAXN]

// return fact x!
int solve(int x)
{
    if (x==0)
        return 1;
    if (dp[x]!=-1)
        return dp[x];
    return (dp[x] = x * solve(x-1));
}

```

## definitions
- **Optimal subproblems**
- **Optimal Substructure** a pattern for using optimal sub-solutions for optimal subproblems
- **Bit Masking**

## links
- [What is dynamic Programming GeeksforGeeks](https://www.geeksforgeeks.org/dynamic-programming/#concepts)
-
