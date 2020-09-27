#9.27 11:04AM
def find_missing_numbers(nums):
  missingNumbers = []
  # TODO: Write your code here
  i = 0
  while i < len(nums):
    j = nums[i] -1
    if nums[j] != nums[i]:
      nums[j], nums[i] = nums[i], nums[j]
    else:
      i+=1

  for i in range(len(nums)):
    if nums[i] != i+1:
      missingNumbers.append(i+1)
  return missingNumbers
