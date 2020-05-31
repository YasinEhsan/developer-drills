# may 20 30
def find_paths(root, sum):
  allPaths = []
  # call helper function
  single_path(root, sum, [], allPaths)
  return allPaths

def single_path(currNode, sum, currPath, allPaths):

  if currNode is None:
    return

  # add current val to this path
  currPath.append(currNode.val)

  if currNode.val == sum and currNode.left is None and currNode.right is None:
    allPaths.append(list(currPath))
  else:
    single_path(currNode.left, sum - currNode.val, currPath, allPaths)
    single_path(currNode.right, sum - currNode.val, currPath, allPaths)

  del currPath[-1]




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
