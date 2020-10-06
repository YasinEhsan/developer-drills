# 10,5 7.10AM
from heapq import *
class SlidingWindowMedian:

  def find_sliding_window_median(self, nums, k):
    result = []
    windowStart = 0

    for windowEnd in range(len(nums)):
      currNum = nums[windowEnd]

      # sliding window exceeds limit
      if windowEnd - k +1 >= 0:
        subNums = nums[windowStart:windowEnd+1]
        print(subNums)
        singleMedian = self.getCurrMedian(subNums)
        result.append(singleMedian)

        windowStart+=1


    return result
  def getCurrMedian(self, subNums):
    maxHeap = []
    minHeap = []

    for currNum in subNums:
      # add to heap
      if not maxHeap or -maxHeap[0] >= currNum:
        heappush(maxHeap, -currNum)
      else:
        heappush(minHeap, currNum)

      # balence the heaps
      if len(maxHeap) > len(minHeap) +1:
        heappush(minHeap, -heappop(maxHeap))
      elif len(minHeap) > len(maxHeap):
        heappush(maxHeap, -heappop(minHeap))

    if len(minHeap) == len(maxHeap):
      return minHeap[0]/2.0 + -maxHeap[0]/2.0
    return -maxHeap[0]
