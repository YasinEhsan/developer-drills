# 9.23
def find_cycle_start(head):
  # TODO: Write your code here
  fast, slow = head, head
  cycle_len = 0

  while fast is not None and fast.next is not None:
    fast = fast.next.next
    slow = slow.next

    if fast == slow:
      cycle_len = getLen(slow)
      break

  return getStartNode(head, cycle_len)

def getLen(slow):
  current = slow
  cycle_len = 0

  while current is not None:
    current = current.next
    cycle_len +=1

    if current == slow:
      break
  return cycle_len

def getStartNode(head, cycle_len):
  pointer1, pointer2 = head, head

  while cycle_len > 0:
    pointer2 = pointer2.next
    cycle_len -=1

  while pointer1 != pointer2:
    pointer2 = pointer2.next
    pointer1 = pointer1.next

  return pointer1
