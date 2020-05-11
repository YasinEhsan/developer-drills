# may 11
#
def search_triplets(arr):
  arr.sort()
  triplets = []

  for i,currNum in enumerate(arr):
    rightPointer, leftPointer = i + 1, len(arr) -1

    if currNum > 0:
      return triplets

    while rightPointer < leftPointer:
      pSum = arr[rightPointer] + arr[leftPointer] + currNum

      if pSum == 0:
        triplets.append([currNum, arr[rightPointer], arr[leftPointer]])
        rightPointer+=1
        leftPointer -=1
      elif pSum < 0:
        rightPointer+=1
      else:
        leftPointer -=1

  return triplets
