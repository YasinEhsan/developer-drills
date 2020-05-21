
# 5.20.20 swaped winstart with window end in first after loop
def max_sub_array_of_size_k(k, arr):
  # TODO: Write your code here
  windowStart, currSum, maxSum = 0,0,0

  for windowEnd in range(len(arr)):
    currSum += arr[windowEnd]

    if windowEnd - windowStart + 1 > k:
      currSum -= arr[windowStart]
      windowStart +=1
    maxSum = max(maxSum, currSum)
  return maxSum



def max_sub_array_of_size_k(k, arr):
  # TODO: Write your code here
    maxSum, currSum, count = 0,0,0
    for i in range(len(arr)):
        if count >= k:
            if maxSum < currSum:
                maxSum = currSum
            currSum -= arr[i-count]
            count-=1
        currSum += arr[i]
        count+=1
    return maxSum

max_sub_array_of_size_k(3,[3,4,5,6,7])


# Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
