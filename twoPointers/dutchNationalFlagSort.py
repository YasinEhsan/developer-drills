# may 11

# modified to provided sol
def dutch_flag_sort(arr):
  # TODO: Write your code here

  low, high, i = 0, len(arr)-1, 0
  while i <= high:
    if arr[i] == 0:
      arr[i], arr[low] = arr[low], arr[i]
      low+=1
      i+=1
    elif arr[i] ==2:
       arr[i], arr[high] = arr[high], arr[i]
       high-=1
    else:
      i+=1

  return arr

# initial attempt Does not work
def dutch_flag_sort(arr):
  # TODO: Write your code here

  low, high, i = 0, len(arr)-1, 0
  while i <= high:
    if arr[i] == 0:
      arr[i], arr[low] = arr[low], arr[i]
      low+=1
    elif arr[i] ==2:
       arr[i], arr[high] = arr[high], arr[i]
       high-=1
    i+=1

  return arr


# this isn't two sort...this is classic sort o(nlogn)
def dutch_flag_sort(arr):
  # TODO: Write your code here

  for leftPointer in range(len(arr)-1):
    rightPointer = leftPointer +1
    while rightPointer < len(arr):
      if arr[leftPointer] > arr[rightPointer]:
        temp = arr[leftPointer]
        arr[leftPointer]  = arr[rightPointer]
        arr[rightPointer] = temp
      rightPointer+=1

  return arr


PUSHNUM 2
PASSPARAM
CALLSTATMETHOD 19
WRITEINT
