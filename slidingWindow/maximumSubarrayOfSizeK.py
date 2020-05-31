# may 30 20
def max_sub_array_of_size_k(k, arr):
  # TODO: Write your code here
  windowStart, currSum, maxSum = 0,0,0

  for endIndex in range(len(arr)):
    currSum += arr[endIndex]

    if endIndex - windowStart + 1 > k:
      currSum -= arr[windowStart]
      windowStart+=1

    # had this in while...most cases its below
    maxSum = max(maxSum, currSum)
  return maxSum
