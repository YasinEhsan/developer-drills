# June 2 20
def non_repeat_substring(str):
  # init vars
  window_start = 0
  # char
  d = {}
  maxLen = 0

  # window range [window_start, window_end]
  # my name is yasin
  # name can be window [left -- right]
  for window_end in range(len(str)):
    rightMostChar = str[window_end]
    if rightMostChar not in d:
      d[rightMostChar] = 0
    d[rightMostChar] +=1

    while d[rightMostChar] > 1:
      leftMostChar = str[window_start]
      # got non-repeat substring or forever loop without having undeer
      d[leftMostChar] -=1
      if d[leftMostChar] == 0:
        del d[leftMostChar]
      window_start +=1

    maxLen = max(maxLen, window_end - window_start +1)
  return maxLen

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
