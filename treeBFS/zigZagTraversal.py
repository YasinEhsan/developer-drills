# may 25 20
# other approach is bool when adding in tempArr.append()
def traverse(root):
  result = []

  if root is None:
    return result

  queue = deque()
  queue.append(root)
  zigZagNow = False

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

    if zigZagNow:
      result.append(tempArr[::-1])
    else:
      result.append(tempArr)
    zigZagNow = not zigZagNow

  return result
