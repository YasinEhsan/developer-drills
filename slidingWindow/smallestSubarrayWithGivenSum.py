# 5.18.20
# forgot that sliding window is in while loop shinking bc last val might ewaql 3 first vals
def smallest_subarray_with_given_sum(s, arr):
  # TODO: Write your code here
  windowStart, minLen, currSum = 0,100,0

  for windowEnd in range(len(arr)):
    currSum += arr[windowEnd]

    while currSum >= s:
      minLen = min(minLen, windowEnd - windowStart + 1)
      currSum -= arr[windowStart]
      windowStart+=1
  return minLen




def smallest_subarray_with_given_sum(s, arr):
  # TODO: Write your code here
    '''
    - have starting index, have currLen, minLen
    - one found then cut down others in while loop style
    - update vars
    '''
    startIndex, currLen, minLen, currSum = 0,0,len(arr), 0

    for endIndex in range(len(arr)):
        currSum += arr[endIndex]
        currLen += 1
        print(endIndex, arr[endIndex], currSum)

        while currSum >= s:
            minLen = min(minLen, currLen)
            currLen -=1
            currSum -= arr[startIndex]
            startIndex += 1

    return minLen
smallest_subarray_with_given_sum(8, [3, 4, 1, 1, 6])

# Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.

# https://www.educative.io/courses/grokking-the-coding-interview/7XMlMEQPnnQ
