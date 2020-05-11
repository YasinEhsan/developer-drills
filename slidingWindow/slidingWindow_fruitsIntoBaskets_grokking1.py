def fruits_into_baskets(fruits):
  # TODO: Write your code here
    startIndex, d, currLen, maxLen = 0, {}, 0, 0

    for i in range(len(fruits)):
        if fruits[i] not in d:
            d[fruits[i]] = 0
        d[fruits[i]] +=1
        currLen+=1

        while len(d) > 2:
            d[fruits[startIndex]]-=1
            currLen-=1
            if d[fruits[startIndex]] == 0:
                del d[fruits[startIndex]]
            startIndex+=1
        maxLen = max(currLen, maxLen)


    return maxLen
fruits_into_baskets(['A','B'])

# Given an array of characters where each character represents a fruit tree, you are given two baskets and your goal is to put maximum number of fruits in each basket. The only restriction is that each basket can have only one type of fruit.

# https://www.educative.io/courses/grokking-the-coding-interview/Bn2KLlOR0lQ
