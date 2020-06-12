# june 11
def find_path(root, sequence):
  # TODO: Write your code here

  if root is None:
    return len(sequence) == 0

  return find_specific_path(root, sequence, 0)

def find_specific_path(currNode, sequence, sequenceIndex):

  if currNode is None:
    return False

  if currNode.val != sequence[sequenceIndex]:
    return False

  if currNode.right is None and currNode.left is None:
    return True

  return find
