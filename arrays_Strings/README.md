# Contents
  - [Naming Convention](#Naming_convention)
  - [Takeaways](#Takeaways)

## Naming_Convention
*source_name_difficulty*
  - **source:** Problems come from LeetCode, HackerRank, and various other mostly online sources. i.e.[LeetCode34](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) or [hrInPrep](https://www.hackerrank.com/interview/interview-preparation-kit?h_l=domains&h_r=hrw&utm_source=hrwCandidateFeedback)
  
  - **name:** custom name will attempt to describe the problem.  Topic wont be mentioned as the problems are sorted by topic. i.e. datBucketProblem
  - **difficulty:** 1-5 range...1 being very hard. The difficulty index is relative during the time attempted. Hard problems will become easier over time.


  - File names starting with "**0_**" are holy files...generally be problem banks. The rules above don't apply.
  - Ignore **.class** files. They are generated from compiling java on VS code




## Takeaways
- 'a' is 97 ascii. 'z' : 122. 'A' : 65. 'Z' : 90. String to ascii...
> ```Java
int ascii = (int) store[j]; // Where store[i] is char[]
```
- Convert from int to string: 
```Java
Integer.toString(int)
```
- convert string to char array: *.toCharArray()*
- replace elements in string. i.e. rm whitespace: *replaceAll("\\s","")*


