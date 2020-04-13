def longest_substring_with_k_distinct(str, k):
  # TODO: Write your code here
    '''
    - have startIndex, currLen, maxLen, d
    '''
    startIndex, currLen, maxLen, d = 0,0,0,{}

    for endIndex in range(len(str)):
        if str[endIndex] not in d:
            d[str[endIndex]] = 0
        d[str[endIndex]] += 1
        currLen+=1

        while len(d) > k:
            d[str[startIndex]]-=1
            if d[str[startIndex]] == 0:
                del d[str[startIndex]]
            currLen -=1
            startIndex +=1

        maxLen = max(maxLen, currLen)
    return maxLen
longest_substring_with_k_distinct("araaci", 2)
