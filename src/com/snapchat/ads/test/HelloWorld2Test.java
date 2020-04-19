package com.snapchat.ads.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HelloWorld2Test {
    ListNode listNodeBuilder(List<Integer> list) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (Integer i : list) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return dummy.next;
    }

    @Test
    public void testAddTwoNumber() {
        HelloWorld2 helloWorld2 = new HelloWorld2();

        ListNode leftOperand = listNodeBuilder(List.of(3, 4, 5));
        ListNode rightOperand = listNodeBuilder(List.of(4, 5, 6));
        ListNode result = helloWorld2.addTwoNumbers(leftOperand, rightOperand);
        // Ensure the result is expected.
        assertEquals(result.val, 7);
        assertEquals(result.next.val, 9);
        assertEquals(result.next.next.val, 1);
        assertEquals(result.next.next.next.val, 1);
    }

}