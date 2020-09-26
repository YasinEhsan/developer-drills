# 9.25 leet 206
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:

        prev = None
        while head is not None:
            next = head.next #storing the one in front
            head.next = prev #pointing it backward
            prev = head # the next to be switchd backwards
            head = next #the next in front

        return prev
