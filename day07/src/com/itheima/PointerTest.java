package com.itheima;

public class PointerTest {
    public static void main(String[] args) {
        //创建ListNode对象
        //定义head初始值和head的指针路径
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        //创建新的Solution对象
        Solution sol = new Solution();
        //打印Solution对象下的方法是否存在循环体
        System.out.println(sol.hasCycle(head));//传参,等于前面ListNode类型的head
    }
}
