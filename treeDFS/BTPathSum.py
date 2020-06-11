# june 10
def has_path(currNode, sum):
  # TODO: Write your code here
  if currNode is None:
    return False

  if currNode.left is None and currNode.right is None and currNode.val == sum:
    return True

  return has_path(currNode.right, sum - currNode.val) or has_path(currNode.left, sum - currNode.val)

  

# may 29 20
def has_path(root, sum):
  # TODO: Write your code here
  if root is None:
    return False

  if root.val == sum and root.left is None and root.right is None:
    return True

  left = has_path(root.left, sum - root.val)
  right = has_path(root.right, sum - root.val)
  return left or right


# may 27 20
def has_path(root, sum):
  # TODO: Write your code here
  if root is None:
    return False

  if root.val == sum and root.left is None and root.right is None:
    return True

  left = has_path(root.left, sum - root.val)
  right = has_path(root.right, sum - root.val)
  return left or right
  # time n | space n
