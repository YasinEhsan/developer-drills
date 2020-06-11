# june 11
# pblm breakdown: find all ways of finding the root to leaf sum eaqul to S
# we have to return an array of such paths
# worked forst time
def find_paths(root, sum):
  allPaths = []
  # TODO: Write your code here

  find_specific_path(root, allPaths, [], sum)
  return allPaths

def find_specific_path(currNode, allPaths, currPath, sum):

  if currNode is None:
    return

  currPath.append(currNode.val)

  if currNode.right is None and currNode.left is None and currNode.val == sum:
    allPaths.append(list(currPath))
    # continue searching
  else:
    find_specific_path(currNode.right, allPaths, currPath, sum - currNode.val)
    find_specific_path(currNode.left, allPaths, currPath, sum - currNode.val)

  # called only once appended to currPath or completed else statement
  del currPath[-1]


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
