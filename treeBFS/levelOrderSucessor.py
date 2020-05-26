

# may 25
def find_successor(root, key):
  if root is None:
    return None

  queue = deque()
  queue.append(root)
  keyFound = False

  while queue:
    levelSize = len(queue)

    for _ in range(levelSize):
      currNode = queue.popleft()

      if keyFound:
        return currNode

      if currNode.val == key:
        keyFound = True

      if currNode.left:
        queue.append(currNode.left)
      if currNode.right:
        queue.append(currNode.right)

# another way

def find_successor(root, key):
  if root is None:
    return None

  queue = deque()
  queue.append(root)

  while queue:
    currNode = queue.popleft()

    if currNode.left:
      queue.append(currNode.left)
    if currNode.right:
      queue.append(currNode.right)
    if currNode.val == key:
      break

  return queue.popleft() if queue else None
