# java
Catalog of interview questions in Java. [Here](_cheatsheet.md) is a one stop shop for Java data structures, algorithms, semantics and syntax.

## Contents
1. [Wildcard lookup using tries)](#Wildcard-lookup)
2. [Count islands / connected graphs using DFS 2D matrix](#Count-islands)
3. [Maximum contiguous subarray sum using DP (Kadane's Algo.)](#contiguous-subarray1)
4. []


### contiguous-subarray1
- **Problem** Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
- **Ask 3 Qs.** is there 0? is there negative #? account for overflow?
- **Complexity** time, space: O(n), O(1)
  + [Go to Code](contiguous-subarray1.java)
  + [Youtube Vid](https://www.youtube.com/watch?v=2MmGzdiKR9Y)
  - [Leetcode](https://leetcode.com/problems/maximum-subarray/)

### Count-islands
- **Problem** Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
- **Clarifying Qs.** what is the max grid? is there directions? are there weights?
- [Go to Code](countIslands.java)
- [Youtube Vid](https://www.youtube.com/watch?v=o8S2bO3pmO4)

### Wildcard-lookup
 - **Problem** There are two parts to this question. The first is a function called setup that takes a list of words. In this function, you have a chance to preprocess the list of words in order to solve and improve the runtime of the second part which is a function called isMember. isMember takes in a string and returns whether or not that string exists in the list of words. isMember may also contain one or more dots (.) which is a wildcard that matches exactly one character of any value in setup at the current index of the string.
- **Clarifying Qs.** ascii or utf? upprcase / lowercase? isSetup called once?
- [Go to Code](wildcardLookup.java)
- [YouTube](https://www.youtube.com/watch?v=Xt2ouYSxWkw)




### readme boiler
- **Problem**
- **Clarifying Qs.**
- **Complexity**
- [Go to Code]()
- [Youtube Vid]()
