# 9.27 11:40AM
def find_all_duplicates(nums):
  duplicateNumbers = []
  # TODO: Write your code here
  i = 0
  while i < len(nums):
    j = nums[i] -1
    if i != j:
      # if already swapped
      if nums[j] == j+1:
        duplicateNumbers.append(j+1)
        i+=1
      else:
        nums[i], nums[j] = nums[j], nums[i]
    else:
      i+=1
  return duplicateNumbers
