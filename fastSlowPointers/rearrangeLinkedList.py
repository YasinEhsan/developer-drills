# 9.26 
def reorder(head):
  # TODO: Write your code here
  fast, slow = head, head
  while fast is not None and fast.next is not None:
    fast = fast.next.next
    slow = slow.next

  reversed_head = rev(slow)
  copy_reversed_head = reversed_head

  first_half_head = head

  while reversed_head is not None and first_half_head is not None:
    the_next = first_half_head.next
    the_next_rev = reversed_head.next
    first_half_head.next = reversed_head
    reversed_head.next = the_next

    first_half_head = the_next
    reversed_head = the_next_rev


  if first_half_head is not None:
    first_half_head.next = None



def rev(head):
  prev = None
  while head is not None:
    the_next = head.next
    head.next = prev
    prev = head
    head = the_next
  return prev
