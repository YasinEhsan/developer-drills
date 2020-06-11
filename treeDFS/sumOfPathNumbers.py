# june 11
# each level times ten adn add once we are at root add it to sum
# oG : check none, right and left for true, return both
# pattern : false case and true case for each rescursiv code

# REVISED ATTEMPT
def find_sum_of_path_numbers(root):
  return find_specific_path(root, 0)

def find_specific_path(currNode, allSum):

  # false case
  if currNode is None:
    return 0

  allSum = allSum * 10 + currNode.val

  # trueCase
  if currNode.right is None and currNode.left is None:
    return allSum

# add left and right sub tree
  return find_specific_path(currNode.right, allSum) + find_specific_path(currNode.left, allSum)


# FISRT ATTEMPT NO WORK
def find_sum_of_path_numbers(root):
  # TODO: Write your code here
  allSum = 0
  find_specific_path(root, 0, allSum)
  return allSum


def find_specific_path(currNode, pathSum, allSum):

  if currNode is None:
    return 0

  pathSum*=10 += currNode.val

  if currNode.left is None and currNode.right is None:
    allSum += pathSum
  else:
    find_specific_path(currNode.right, pathSum, allSum)
    find_specific_path(currNode.left, pathSum, allSum)


# 5 30 20
def find_sum_of_path_numbers(root):
  # TODO: Write your code here
  totalSum = get_path_sum(root, 0)
  return totalSum

def get_path_sum(currNode, totalSum):

  # base case
  if currNode is None:
    return 0

  totalSum = 10*totalSum + currNode.val

  # problem case
  if currNode.right is None and currNode.left is None:
    return totalSum

  # left and right subtree
  left = get_path_sum(currNode.right, totalSum )
  right = get_path_sum(currNode.left, totalSum)

  return left + right
