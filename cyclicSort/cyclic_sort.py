#9.27 10:30AM
def cyclic_sort(nums):
  # TODO: Write your code here
  # for i in range(len(nums)):
  #   nums[i] = i+1

  pointer = 0
  while pointer < len(nums):
    currValue = nums[pointer] -1
    if nums[pointer] != nums[currValue]:
      nums[pointer], nums[currValue] = nums[currValue], nums[pointer]
    else:
      pointer+=1
  return nums
