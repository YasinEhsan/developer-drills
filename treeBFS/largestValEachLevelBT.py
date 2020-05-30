# may 29 20
from collections import deque
import math
def find_level_averages(root):
  result = []
  # TODO: Write your code here
  if root is None:
    return result

  queue = deque()
  queue.append(root)

  while queue:
    levelSize = len(queue)
    largest = -math.inf

    for _ in range(levelSize):
      currNode = queue.popleft()

      if currNode.val > largest:
        largest = currNode.val

      # OR
      largest = max(largest, currNode.val)

      if currNode.left:
        queue.append(currNode.left)
      if currNode.right:
        queue.append(currNode.right)
    result.append(largest)
  return result
  # n time | n space
