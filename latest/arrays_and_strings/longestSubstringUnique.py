def lengthOfLongestSubstring(s):
    """
    :type s: str
    :rtype: int
    """

    windowStart = 0
    unique_chars = {}
    longest_len = 0

    for windowEnd in range(len(s)):
        rightMostChar = s[windowEnd]
        if rightMostChar not in unique_chars:
            unique_chars[rightMostChar] = 0
        unique_chars[rightMostChar] +=1

        while unique_chars[rightMostChar] > 1:
            # print(windowEnd)
            leftMostChar = s[windowStart]
            unique_chars[leftMostChar]-=1
            if unique_chars[leftMostChar] == 0:
                del unique_chars[leftMostChar]
            windowStart +=1

        longest_len = max(longest_len, windowEnd - windowStart +1)

    return longest_len

print(lengthOfLongestSubstring("abcabcbb"))
