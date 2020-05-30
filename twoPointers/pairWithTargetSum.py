# may 29 20
def pair_with_targetsum(arr, target_sum):
  # init pointers
  left = 0
  right = len(arr) -1

  # loop until pair found
  while left < right:
    # get sum
    currSum = arr[left] + arr[right]

    if currSum == target_sum:
      return [left, right]
    elif currSum < target_sum:
      # need bigger number
      left+=1
    else:
      # sum too big
      right -=1
  return [-1, -1]
  # n time | 1 space
