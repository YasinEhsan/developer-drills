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
