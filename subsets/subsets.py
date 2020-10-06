def find_subsets(nums):
  subsets = []
  # TODO: Write your code here

  subsets.append([])
  for i in range(len(nums)):
    storeLen = len(subsets)
    for j in range(0,storeLen):
      currSet = list(subsets[j])
      currSet.append(nums[i])
      subsets.append(currSet)
  return subsets
