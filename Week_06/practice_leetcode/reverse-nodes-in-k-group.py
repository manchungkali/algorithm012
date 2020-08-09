# 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
# k 是一个正整数，它的值小于或等于链表的长度。
# 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
# 示例：
# 给你这个链表：1->2->3->4->5
# 当 k = 2 时，应当返回: 2->1->4->3->5
# 当 k = 3 时，应当返回: 3->2->1->4->5
# 说明：
# 你的算法只能使用常数的额外空间。
# 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
class Solution:
    def reverseKGroup(self, head: ListNode, k: int) -> ListNode:
        if head is None or k < 2:
            return head
        dummy = ListNode(0)
        dummy.next = head
        start = dummy
        end = head
        count = 0
        while end:
            count += 1
            if count % k == 0:
                start = self.reverse(start, end.next)
                end = start.next
            else:
                end = end.next
        return dummy.next
    
    def reverse(self, start, end):
        prev, cur = start, start.next
        first = curr
        while curr != end:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        start.next = prev
        first.next = curr
        return first




# class Solution:
#     def reverseKGroup(self, head: ListNode) -> ListNode:
#         currnet = head
#         for i in range(k):
#             if not currnet:
#                 return head
#             current = currnet.next
#         current = head
#         previous = None
#         for in range(k):
#             current_next = current.next
#             current.next = previous
#             previous = current
#             current = current_next
#         head.next = self.reverseKGroup(current, k)
#         return previous