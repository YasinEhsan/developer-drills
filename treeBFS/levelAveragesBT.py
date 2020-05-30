# may 29 20
from collections import deque
def find_level_averages(root):
  result = []
  # TODO: Write your code here
  if root is None:
    return result

  queue = deque()
  queue.append(root)

  while queue:
    levelSize = len(queue)
    levelSum = 0
    for _ in range(levelSize):
      currNode = queue.popleft()
      levelSum += currNode.val

      if currNode.left:
        queue.append(currNode.left)
      if currNode.right:
        queue.append(currNode.right)
    result.append(levelSum/levelSize)
  return result
  # n time | n space

  
# may 26 20
from collections import deque
def find_level_averages(root):
  result = []
  if root is None:
    return result

  queue = deque()
  queue.append(root)

  while queue:
    levelSize = len(queue)
    currSum = 0

    for _ in range(levelSize):
      node = queue.popleft()
      currSum += node.val

      if node.left:
        queue.append(node.left)
      if node.right:
        queue.append(node.right)

    result.append(currSum/levelSize)

  return result
# time n space n


# may 25
def find_level_averages(root):
  result = []
  if root is None:
    return result

  queue = deque()
  queue.append(root)

  while queue:
    levelSize = len(queue)
    levelSum = 0
    for _ in range(levelSize):
      currNode = queue.popleft()
      levelSum += currNode.val

      if currNode.right:
        queue.append(currNode.right)
      if currNode.left:
        queue.append(currNode.left)

    result.append(levelSum/levelSize)
  return result
