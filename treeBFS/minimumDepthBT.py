#  may 26 20
# forgot is none for if statements
# returned level size instead of mindepth (got lucky for this cases)
from collections import deque
def find_minimum_depth(root):
  minDepth = 0
  if root is None:
    return minDepth

  queue = deque()
  queue.append(root)

  while queue:
    minDepth +=1
    levelSize = len(queue)
    tempArr = []

    for _ in range(levelSize):
      node = queue.popleft()
      tempArr.append(node)

      #perhaps switch with tuples
      if node.left is None and node.right is None:
        return minDepth

      if node.left:
        queue.append(node.left)
      if node.right:
        queue.append(node.right)
  return 0
# time n space n# time n space n

# may 25
def find_minimum_depth(root):
  # TODO: Write your code here
  minDepth = 0
  if root is None:
    return minDepth

  queue = deque()
  queue.append(root)

  while queue:
    levelSize = len(queue)
    minDepth +=1

    for _ in range(levelSize):
      currNode = queue.popleft()

      if currNode.left is None and currNode.right is None:
        return minDepth

      if currNode.left:
        queue.append(currNode.left)

      if currNode.right:
        queue.append(currNode.right)

  return minDepth
