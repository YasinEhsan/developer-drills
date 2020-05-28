# may 27 20
# wasn't awre wrote each of the windowStart as windown end
def non_repeat_substring(str):
  # TODO: Write your code here
  windowStart, maxLen, d = 0,0,{}

  for windowEnd in range(len(str)):
    leftChar = str[windowEnd]
    if leftChar not in d:
      d[leftChar] = 0
    d[leftChar] +=1

    while d[leftChar] > 1:
      rightChar = str[windowStart]
      d[rightChar] -=1
      if d[rightChar] == 0:
        del d[rightChar] 
      windowStart+=1

    maxLen = max(maxLen, windowEnd - windowStart +1)
  return maxLen

# 5.21.20 given sol were diff... i did simmialr to k distict
def non_repeat_substring(str):
  # TODO: Write your code here

  windowStart, maxLen, d = 0,0, {}

  for windowEnd in range(len(str)):
    rightChar = str[windowEnd]
    if rightChar not in d:
      d[rightChar] = 0
    d[rightChar] +=1

    while d[rightChar] > 1:
      leftchar = str[windowStart]
      d[leftchar] -=1
      windowStart +=1

    maxLen = max(maxLen, windowEnd - windowStart +1)

  return maxLen
