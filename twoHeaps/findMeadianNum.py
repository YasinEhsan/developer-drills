# 10.4 8.29AM
from heapq import *

class MedianOfAStream:
  minHeap = [] #nums greater than x, where median can be the samllest of the largest
  maxHeap = [] #nums less than x,

  def insert_num(self, num):
    # TODO: Write your code here
    '''
    - top of heap or first in array in the special number in one case its the largest the other smallest
    - we add numbers into the heap with maxheoa having allowed one more than min heap
    - at the end if thelen are eqaul we retutn the av of 0 if not we retutn the maxHeap
    - after each itme we add we check if it ids good


    '''

    # add to heap
    if not self.maxHeap or -self.maxHeap[0] >= num:
      heappush(self.maxHeap, -num)
    else:
      heappush(self.minHeap, num)

    # balence the heaps
    if len(self.maxHeap) > len(self.minHeap) + 1:
      heappush(self.minHeap, -heappop(self.maxHeap))
    elif len(self.maxHeap) < len(self.minHeap):
      heappush(self.maxHeap, -heappop(self.minHeap))
    return -1

  def find_median(self):
    # TODO: Write your code here

    if len(self.minHeap) == len(self.maxHeap):
      return self.minHeap[0] / 2.0 + -self.maxHeap[0] / 2.0
    return -self.maxHeap[0]


# 10.4 8:14AM
from heapq import *

class MedianOfAStream:

  minHeap = [] #nums greater than x, where median can be the samllest of the largest
  maxHeap = [] #nums less than x,

  def insert_num(self, num):
   # TODO: Write your code here
    if not self.maxHeap or -self.maxHeap[0] >= num:
      heappush(self.maxHeap, -num)
    else:
      heappush(self.minHeap, num)

    #+2 ahead of minheap: plus two because maxheap takes one more if odd
    if len(self.maxHeap) > len(self.minHeap) + 1:
      heappush(self.minHeap, -heappop(self.maxHeap))
    # the oddness should be on the max heap side
    elif len(self.maxHeap) < len(self.minHeap):
      heappush(self.maxHeap, -heappop(self.minHeap))

  def find_median(self):
    # TODO: Write your code here
    if len(self.minHeap) == len(self.maxHeap):
      return self.minHeap[0]/2.0 + -self.maxHeap[0]/2.0

    return -self.maxHeap[0]
