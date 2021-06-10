http://www.nowcoder.com/practice/650474f313294468a4ded3ce0f7898b9

思路：采用快慢指针方法，快指针每次走两步，慢指针每次走一步，如果相遇表示有环，如果有一个为null（已走完）表示没有环

public boolean hasCycle(ListNode head) {
    if (head == null)
        return false;
    //快慢两个指针
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
        //慢指针每次走一步
        slow = slow.next;
        //快指针每次走两步
        fast = fast.next.next;
        //如果相遇，说明有环，直接返回true
        if (slow == fast)
            return true;
    }
    //否则就是没环
    return false;
}
