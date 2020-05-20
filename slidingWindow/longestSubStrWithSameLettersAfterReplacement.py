

# 5.19  WORKS
def length_of_longest_substring(str, k):
  # TODO: Write your code here
  windowStart, limit, maxLen, d = 0, 0,0, {}

  for windowEnd in range(len(str)):
    rightChar = str[windowEnd]
    if rightChar not in d:
      d[rightChar] = 0
    d[rightChar] +=1
    limit = max(limit, d[rightChar])

    if windowEnd - windowStart + 1 - limit > k:
      leftChar = str[windowStart]
      d[leftChar] -=1
      windowStart +=1
    maxLen = max(maxLen, windowEnd - windowStart + 1 )



  return maxLen

# 5.19 DN WORK
def length_of_longest_substring(str, k):
  # TODO: Write your code here
  windowStart, limit, maxLen, d = 0, 0,0, {}

  for windowEnd in range(len(str)):
    rightChar = str[windowEnd]
    if rightChar not in d:
      d[rightChar] = 0
    d[rightChar] +=1

    # to catch when were replacing two-k more same letters
    if len(d) > k:
      limit +=1

    # while len(d) - k > k or limit > k:
    while limit > k :
      leftChar = str[windowStart]
      d[leftChar]-=1
      if d[leftChar] == 0:
        del d[leftChar]
      print(k, str, windowStart, windowEnd, limit)
      windowStart +=1
      limit -=1

    maxLen = max(maxLen, windowEnd - windowStart + 1)
