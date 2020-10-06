# 10.5 8.51AM
from heapq import *
def find_maximum_capital(capital, profits, numberOfProjects, initialCapital):
  # TODO: Write your code here
  minCapitalHeap = []
  maxProfitHeap = []

  # adding to minheap...how do we knwo the min is always ready for pop
  for i in range(len(capital)):
    heappush(minCapitalHeap, (capital[i], i))

  totalCapital = initialCapital


  for projects in range(numberOfProjects):
    # chk if
    while minCapitalHeap and minCapitalHeap[0][0] <= totalCapital:
      capital, i = heappop(minCapitalHeap)
      heappush(maxProfitHeap, -profits[i])

    if not maxProfitHeap:
      break

    totalCapital += -heappop(maxProfitHeap)
  return totalCapital
