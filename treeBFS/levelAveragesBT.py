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
