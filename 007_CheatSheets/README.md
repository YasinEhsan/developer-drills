# Some handy dandy cheat-sheets.
<!-- TOC depthFrom:1 depthTo:6 withLinks:1 updateOnSave:1 orderedList:0 -->

- [Some handy dandy cheat-sheets.](#some-handy-dandy-cheat-sheets)
	- [Java Takeaways](#java-takeaways)
	- [Advanced Bash commands](#advanced-bash-commands)
	- [Git Takeaways](#git-takeaways)
		- [Branch + Merge](#branch-merge)
		- [Local to Global repo setup](#local-to-global-repo-setup)

<!-- /TOC -->

## Java Takeaways
- **.Equals()** compares objects | **.compareTo** finds lexicographic difference | **==** checks memory address
- Neat one-liner condition statement **int result = a > b ? x : y;**
- Override is prioritizing local methods over parent methods
- Overload is methods with same names different parameters
- Strings are immutable. Once defined, specific locations in string can't be changed. i.e. "wewr" change the first 'w' to 'K'
- int randomWithRange = (int)(MATH.random()(max - min + 1)) + min

## Advanced Bash commands
- *ditto folder1 folder2* copies the contents of folder1 into folder2


## Git Takeaways
### Branch + Merge
  - **Create Branch:** "git checkout ____" creates subbranch from current head
  - I am calling the head in which a subbranch is created from a parent. It could be called master, feature/..., releases, etc
  - Parent branches shouldn't be tweaked while work is being done in subbranch
  - **Merge Branch:** "git checkout" to parent branch. And then "git Merge" with the branch you currently working on. This merges the working branch with the parent branch. Afterwards checkout to working branch and merge with parent. The order is important.
  - In the network graphics, working branches should be ahead of main branch before any merging. After merging, all tags should align with parent branch being a straight line all along branching process.
  - In between each stage of merge/checkouts make sure to git pull.
  - Also, do the merges from child's editor's computer for iOS projects. This gives us an option to 86 that branch without having to redo the project if there are any serious .plist / pod / XML merge conflicts.


### Local to Global repo setup
  - git config --list (checks current git account)
    - git config -- global user.name " "
    - git config -- global user.email " "
    - some others pre-reqs: SSH for alternate to https and GPG keys for verified git commits
  - git init
  - echo "#repo-name" > README.md
  - git commit -am" "
	- create the git repo online WITHOUT a README. Then copy the code from the section that reads: **"...or push an existing repository from the command line"** 
  - git push (-u origin master)
