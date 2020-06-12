
___________________________________________________________________
# june 11
# problem given a sum find a subset that equals sum return the number of matchs
# a solution is find all paths and then for each path each subpath find if added in sum
def count_paths(root, S):
  # TODO: Write your code here

  allPaths = []

  # finds all paths
  find_specific_path(root, allPaths, [])

   # find subarray matching if possible
  # return get_num_of_matches([[12,7,4]], 11)
  return get_num_of_matches(allPaths, S)


  # for i in range(len(allPaths)):
  #   print(allPaths[i])

  # return

def get_num_of_matches(allPaths, sum):
  totalMatches = 0

  for i in range(len(allPaths)):
    startWindow = 0
    currSum = 0
    for endWindow in range(len(allPaths[i])):
      currSum += allPaths[i][endWindow]
      # print(allPaths[i][endWindow])

      if currSum == sum:
        totalMatches +=1

      while currSum > sum:
        currSum -= allPaths[i][startWindow]
        startWindow +=1

  return totalMatches


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
 ___________________________________________________________________
