package com.itheima;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;//传参
        ListNode fast = head;//传参

        //是否存在环
        while (fast != null && fast.next != null) {
            slow = slow.next;//slow = head.next->slow = head.next.next...
            fast = fast.next.next;//fast = head.next.next->fast = head.next.next.next.next...
            if (slow == fast) {
                return true;//相遇构成循环
            }
        }
        return false;
    }
}
