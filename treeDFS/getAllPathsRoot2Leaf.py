# june 11
# this is a subprerobloem to another but this finds all paths
# problem given a sum find a subset that equals sum return the number of matchs
# a solution is find all paths and then for each path each subpath find if added in sum
def count_paths(root, S):
  # TODO: Write your code here

  allPaths = []

  find_specific_path(root, allPaths, [])
  # get_num_of_matches(allPaths, S)
  for i in range(len(allPaths)):
    print(allPaths[i])

  # return

def find_specific_path(currNode, allPaths, currPath):

  if currNode is None:
    return

  currPath.append(currNode.val)

  if currNode.left is None and currNode.right is None:
    allPaths.append(list(currPath))

  else:
    find_specific_path(currNode.left, allPaths, currPath)
    find_specific_path(currNode.right, allPaths, currPath)

  del currPath[-1]
