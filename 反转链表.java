http://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca
输入一个链表，反转链表后，输出新链表的表头。

    public class Solution {
    public ListNode ReverseList(ListNode head) {
    ListNode pre = null; // pre指针记录已反转链表的头节点
    ListNode cur = head; // cur指针记录未反转链表的第一个节点（当前节点）
    ListNode next = null; // next指针记录当前节点的下一个节点（防止节点丢失）
     while (cur != null) {
         next = cur.next; // 当前结点与链表断开并指向前一个结点pre
         cur.next = pre;  // 反转链表，指向上一个节点
         pre = cur; // 指针后移
         cur = next;
     }
        return pre; // 当循环结束时,pre所指的就是反转链表的头结点
    }
}
