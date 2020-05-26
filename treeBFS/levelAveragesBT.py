
# may 26 20
def traverse(root):
  result = deque()
  if root is None:
    return result
  queue = deque()
  queue.append(root)

  while queue:
    levelSize = len(queue)
    tempArr = []

    for _ in range(levelSize):
      node = queue.popleft()
      tempArr.append(node.val)

      if node.left:
        queue.append(node.left)
      if node.right:
        queue.append(node.right)

    result.appendleft(tempArr)
  return result
# time O(n) space o(n)
# 3 tries, curr.val and append left syntax


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
