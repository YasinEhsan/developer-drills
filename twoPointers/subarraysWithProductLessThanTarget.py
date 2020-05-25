# may 24...use sling window approach and creative about subarrays
# sol dnot work
def find_subarrays(arr, target):

  windowStart = 0
  prod = 1
  results = []

  for windowEnd in range(len(arr)):
    prod *= arr[windowEnd]

    while prod >= target and windowStart < len(arr):
      prod /= arr[windowStart]
      windowStart +=1

    tempArr = []
    #  temp_list = deque()
    for num in range(windowEnd, windowStart-1, -1):
      tempArr.insert(0, arr[num])
      # temp_list.appendLeft(arr[num])
      results.append(tempArr)


  return results





# https://www.golibrary.co/find-all-subarrays-with-product-less-than-target/
