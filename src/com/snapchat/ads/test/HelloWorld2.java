package com.snapchat.ads.test;

class ListNode {
    int val;
    ListNode next;

    ListNode(int v) {
        val = v;
    }
}

public class HelloWorld2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry_over) {
        if (l1 == null) {
            if (carry_over == 0) {
                return l2;
            } else {
                return addTwoNumbers(l2, new ListNode(carry_over), 0);
            }
        }
        if (l2 == null) {
            return addTwoNumbers(l2, l1, carry_over);
        }
        int val = (l1.val + l2.val + carry_over) % 10;
        int new_carry_over = (l1.val + l2.val + carry_over) / 10;
        ListNode currVal = new ListNode(val);
        currVal.next = addTwoNumbers(l1.next, l2.next, new_carry_over);
        return currVal;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public void printOutListNode(ListNode l1) {
        while (l1 != null) {
            System.out.print(l1.val);
            System.out.print("->");
            l1 = l1.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(9);
        HelloWorld2 helloWorlds = new HelloWorld2();
        ListNode retVal = helloWorlds.addTwoNumbers(l1, l2);
        helloWorlds.printOutListNode(retVal);
    }
}
