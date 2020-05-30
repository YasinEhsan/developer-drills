# may 29 20
def find_paths(root, sum):
  allPaths = []
  # TODO: Write your code here
  find_single_path(root, [], allPaths, sum)
  return allPaths

def find_single_path(currNode, thisPath, allPaths, sum):

  if currNode is None:
    return

  thisPath.append(currNode.val)

  if currNode.val == sum and currNode.right is None and currNode.left is None:
    allPaths.append(list(thisPath))
  else:
    find_single_path(currNode.left, thisPath, allPaths, sum - currNode.val)
    find_single_path(currNode.right, thisPath, allPaths, sum - currNode.val)

  del thisPath[-1]
