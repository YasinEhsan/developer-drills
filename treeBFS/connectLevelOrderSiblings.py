#  may 26 20
# the if statement w i!=0 had three before...sol given also had not index
def connect_level_order_siblings(root):
  queue = deque()
  queue.append(root)

  while queue:
    levelSize = len(queue)
    pastNode = None
    for i in range(levelSize):
      node = queue.popleft()

      if i != 0:
        pastNode.next = node
      pastNode = node

      if node.left:
        queue.append(node.left)
      if node.right:
        queue.append(node.right)
