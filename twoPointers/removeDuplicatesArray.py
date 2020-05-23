
# 5.22.20 no left righ pointers
def remove_duplicates(arr):
  # TODO: Write your code here

  nonDuplicateIndex = 1

  for i in range(1, len(arr)):
    if arr[nonDuplicateIndex-1] != arr[i]:
      arr[nonDuplicateIndex] = arr[i]
      nonDuplicateIndex +=1
  return nonDuplicateIndex
