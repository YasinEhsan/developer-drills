#  may 26 20
from collections import deque
def find_max_depth(root):
  maxDepth = 0
  if root is None:
    return minDepth

  queue = deque()
  queue.append(root)

  while queue:
    maxDepth +=1
    levelSize = len(queue)
    tempArr = []

    for _ in range(levelSize):
      node = queue.popleft()
      tempArr.append(node)

      if node.left:
        queue.append(node.left)
      if node.right:
        queue.append(node.right)
  return maxDepth
# time n space n
