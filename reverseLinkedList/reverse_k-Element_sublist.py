# 9.28 7:14AM
def reverse_every_k_elements(head, k):
  # TODO: Write your code here
  # store end elements of the list

  pointer = head
  one_step = pointer.next
  count = 1

  post_end_nodes = []
  start_nodes = [pointer]

  while one_step is not None:
    if count % k == 0:
      start_nodes.append(one_step)
    count+=1

    # MAJOR DEBUG : cant forget this else infinite loop
    pointer = one_step
    one_step = one_step.next

  reversed_heads = []
  for i in range(len(start_nodes)):
    # the last case
    if i == len(start_nodes) -1:
      reversed_heads.append(reverse(start_nodes[i], None))
    # sending begin node and post end node for quiting
    else:
      reversed_heads.append(reverse(start_nodes[i], start_nodes[i+1]))

  # glue it all together
  pointer = reversed_heads[0]
  for i in range(len(reversed_heads)-1):
    while pointer.next is not None:
      pointer = pointer.next
    pointer.next = reversed_heads[i+1]

  return reversed_heads[0]


def reverse(head, end):
  prev = None
  while head is not end:
    next = head.next
    head.next = prev
    prev = head
    head = next
  return prev
