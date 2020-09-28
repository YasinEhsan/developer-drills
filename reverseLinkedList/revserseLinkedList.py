#9.27 11:46
def reverse(head):
  # TODO: Write your code here
  prev = None
  while head != None:
    next = head.next
    head.next = prev
    prev = head
    head = next
  return prev
