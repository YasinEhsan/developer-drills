# 9.25 (workhorse usps day)
# BRUTE FORCE
def find_mid_of_linked_list(head):
  # TODO: Write your code here
  fast, slow = head, head
  _count = 0
  while fast is not None and fast.next is not None:
    fast = fast.next.next
    _count+=1


  while _count/2 + 1 > 0:
    slow = slow.next
  return slow.value

def find_middle_of_linked_list(head):
  fast, slow = head, head
  while fast is not None and fast.next is not None:
    fast, slow = fast.next.next, slow.next
  return slow
