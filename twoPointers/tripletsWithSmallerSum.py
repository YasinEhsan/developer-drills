# may 26 20
# issue in appending and subtarcting pointers in while loop
def triplet_with_smaller_sum(arr, target):
  count = 0
  arr.sort()

  for i in range(len(arr)-1):
    left = i +1
    right = len(arr) -1

    while left < right:
      currSum = arr[right] + arr[left] + arr[i]
      if currSum < target:
        count+= right -left
        left+=1
        # break
      else:
        right -=1
  return count
# time nlogn
