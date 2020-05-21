
# 5.20 forgot to add max() in maxLen -- returned tuple
def longest_substring_with_k_distinct(str, k):
  # TODO: Write your code here
  windowStart,  maxLen, d = 0,0, {}

  for windowEnd in range(len(str)):
    rightChar  = str[windowEnd]
    if rightChar not in d:
      d[rightChar] = 0
    d[rightChar] +=1

    while len(d) > k:
      leftChar = str[windowStart]
      d[leftChar] -=1
      if  d[leftChar] == 0:
        del d[leftChar]
      windowStart +=1

    maxLen = max(maxLen, windowEnd - windowStart + 1)
  return maxLen
