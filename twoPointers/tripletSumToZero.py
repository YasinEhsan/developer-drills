# may 24
def search_triplets(arr):
  arr.sort()
  triplets = []

  for i in range(len(arr)):
    leftPtr = i+1
    rightPtr = len(arr) -1

    while leftPtr < rightPtr:
      sum = arr[leftPtr] + arr[rightPtr]
      if sum + arr[i] == 0:
        target.append([arr[i], arr[leftPtr], arr[rightPtr]])
        rightPtr -=1
        leftPtr +=1
      elif sum + arr[i] > 0:
        rightPtr -=1
      else
        leftPtr +=1
  return triplets



# may 11 good use of enum
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
