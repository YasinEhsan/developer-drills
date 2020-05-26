# may 26 20
def traverse(root):
  result = []
  if root is None:
    return result

  queue = deque()
  queue.append(root)

  while queue:
    levelSize = len(queue)
    tempArr = []
    for _ in range(levelSize):
      currNode = queue.popleft()
      tempArr.append(currNode.val)

      if currNode.left:
        queue.append(currNode.left)
      if currNode.right:
        queue.append(currNode.right)

    result.append(tempArr)

  return result
# time O(N) space O(N)


# may 25 20
def traverse(root):
  result = []
  # TODO: Write your code here

  queue = deque()
  queue.append(root)

  while queue:
    levelSize = len(queue)
    currLevel = []
    while levelSize > 0:
      node = queue.popleft()
      currLevel.append(node.val)
      if node.left:
        queue.append(node.left)

      if node.right:
        queue.append(node.right)

      levelSize -=1
    result.append(currLevel)

  return result

# https://www.geeksforgeeks.org/deque-in-python/
