#  may 26 20
def connect_all_siblings(root):
  # TODO: Write your code here

  queue = deque()
  queue.append(root)
  prevNode = None

  while queue:
    node = queue.popleft()

    if prevNode:
      prevNode.next = node
    prevNode = node

    if node.left:
      queue.append(node.left)
    if node.right:
      queue.append(node.right)
