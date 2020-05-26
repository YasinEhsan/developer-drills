# may 26 20
# appended to result "node.val" instead of val
def tree_right_view(root):
  result = []
  # TODO: Write your code here

  if root is None:
    return result

  queue = deque()
  queue.append(root)

  while queue:
    levelSize = len(queue)

    for i in range(levelSize):
      node = queue.popleft()
      if i == levelSize -1:
        result.append(node)

      if node.left:
        queue.append(node.left)
      if node.right:
        queue.append(node.right)

  return result
