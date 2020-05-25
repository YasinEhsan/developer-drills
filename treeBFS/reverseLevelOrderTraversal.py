# may 25 20
def traverse(root):
  queue = deque()
  result = []
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

    # if was result.insert(0, tempArr) algo complexity wud be higher bc opration O(n) cost
    result.append(tempArr)

    # I can do return [::-1] O(N) space cost new lsit created
    result.reverse()
  return result
