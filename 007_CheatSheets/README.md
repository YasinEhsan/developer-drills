# Description

*Some handy cheat-sheets.*

## Java Takeaways
- **.Equals()** compares objects | **.compareTo** finds lexicographic difference | **==** checks memory address
- Neat one-liner condition statement **int result = a > b ? x : y;**
- Override is prioratizing local methods over parent methods
- Overload is methods with same names different parameters
- Strings are immutable. Once defined, specific locations in string can't be changed. i.e. "wewr" change the first 'w' to 'K'
- int randomWithRange = (int)(MATH.random()*(max - min + 1)) + min

## Git Takeaways
- Branch + Merge
    - **Branch:** "git checkout ____" creates subbranch from current head
    - I am calling parent branch the head in which a subbranch is created from. It could be called master, feature/..., releases, etc
    - Parent branches shouldn't be tweaked while work is being done in subbranch
    - **Merge:** "git checkout" to parent branch. And then "git Merge" with the branch you currently working on. This merges the working branch with the parent branch. Afterwards checkout to working branch and merge with parent. The order is important.
    - In the network graphics, working branches should be ahead of main branch before any merging. After merging, all tags should align with parent branch being a straight line all along branching process.
