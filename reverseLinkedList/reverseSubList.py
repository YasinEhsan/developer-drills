#9.28 6:23AM
def reverse_sub_list(head, p, q):
  # TODO: Write your code here
  # to capture the apart
  pre_p, post_q = head, head
  # to capture the range
  p_node, q_node = head, head
  # to track others
  pointer = head
  oneStep = pointer.next

  while oneStep is not None:
    if oneStep.value == p:
      pre_p = pointer
      p_node = oneStep
    elif pointer.value == q:
      post_q = oneStep
      q_node = pointer

    pointer = oneStep
    oneStep = oneStep.next

  reversed_head = reverse(p_node, post_q)
  pre_p.next = reversed_head

  while reversed_head.next is not None:
    reversed_head = reversed_head.next
  reversed_head.next = post_q

  return pre_p


def reverse(head, end):
  prev = None
  while head is not end:
    next = head.next
    head.next = prev
    prev = head
    head = next
  return prev


# 9.27 5:34PM
def reverse_sub_list(head, p, q): #response is off by one element
  # TODO: Write your code here
  # to capture the apart
  pre_p, post_q = head, head
  # to capture the range
  p_node, q_node = head, head
  # to track others
  pointer = head
  oneStep = pointer.next

  while oneStep is not None:
    if oneStep.value == p:
      pre_p = pointer
      p_node = oneStep
    elif pointer.value == q:
      post_q = oneStep
      q_node = pointer

    pointer = oneStep
    oneStep = oneStep.next

  reversed_head = reverse(p_node, q_node)
  pre_p.next = reversed_head

  while reversed_head.next is not None:
    reversed_head = reversed_head.next
  reversed_head.next = post_q

  return pre_p


def reverse(head, end):
  prev = None
  while head is not end:
    next = head.next
    head.next = prev
    prev = head
    head = next
  return prev
