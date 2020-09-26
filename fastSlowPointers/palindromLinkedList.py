# 9.26
def is_palindromic_linked_list(head):
  # TODO: Write your code here
  fast, slow = head, head
  while fast is not None and fast.next is not None:
    fast = fast.next.next
    slow = slow.next #this is at midpoint is even then more right

  revesered_head = rev(slow)
  copy_rev_head = revesered_head

  while head is not None and revesered_head is not None:
    if head.value != revesered_head.value:
      break
    head = head.next
    revesered_head = revesered_head.next

  rev(copy_rev_head)

  if head is None or revesered_head is None:
    return True

  return False

def rev(head):
  prev = None
  while head is not None:
    the_next = head.next
    head.next = prev
    prev = head
    head = the_next
  return prev
