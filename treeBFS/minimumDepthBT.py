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
