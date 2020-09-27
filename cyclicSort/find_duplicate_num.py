#9.27 11:34
def find_duplicate(nums):
  # TODO: Write your code here
  i = 0
  while i < len(nums):
    j = nums[i] -1
    if i != j:
      # already sorted
      if nums[j] == j+1:
        return j+1
      nums[i], nums[j] = nums[j], nums[i]
    else:
      i+=1
  return len(nums)
