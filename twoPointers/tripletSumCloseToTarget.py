# may 28 20
def triplet_sum_close_to_target(arr, target_sum):
  # TODO: Write your code here
  arr.sort()
  closestSum = 0
  for i in range(len(arr)):
    left = i+1
    right = len(arr)-1

    while left < right:
      currSum = arr[i] + arr[left] + arr[right]
      if abs(currSum - target_sum) < abs(closestSum - target_sum):
        closestSum = currSum
      if currSum == target_sum:
        return currSum
      elif currSum < target_sum:
        left+=1
      else:
        right -=1



  return closestSum
  # n + nlogn time (WRONG n^2 worst case) | n space (used in behind scences sorting)
