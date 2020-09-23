# 9.23
def has_cycle(head):
  # TODO: Write your code here
  # has to be diff
  fast, slow = head, head

  while fast is not None and fast.next is not None:
    slow = slow.next
    fast = fast.next.next

    if slow == fast:
      return True
    # this wont work since fast is always 2 ahead of slow, fast should cath up from the back
    # head = head.next


  return False

  # 6.19
def has_cycle(head):
  # TODO: Write your code here

  fast_pointer = head
  slow_pointer = head

  while fast_pointer and fast_pointer.next:

    fast_pointer = fast_pointer.next.next
    slow_pointer = slow_pointer.next

    if fast_pointer == slow_pointer:
      return True

  return False

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
