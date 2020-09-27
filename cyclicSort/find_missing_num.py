#9.27 10:45am
def find_missing_number(nums):
  # TODO: Write your code here
  i = 0
  while i < len(nums):
    j = nums[i]
    if nums[i] < len(nums) and nums[j] != nums[i]:
      nums[i], nums[j] = nums[j], nums[i]
    else:
      i+=1

  for i in range(len(nums)):
    if nums[i] != i:
      return i

  return len(nums)
