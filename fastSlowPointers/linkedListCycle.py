# june 11
def has_cycle(head):
  # TODO: Write your code here
  slowPointer = head
  fastPointer = head


  while fastPointer is not None and fastPointer.next is not None:

    slowPointer = slowPointer.next
    fastPointer = fastPointer.next.next

    if fastPointer is None:
      return False


    if fastPointer.value == slowPointer.value:
      return True

  return False
