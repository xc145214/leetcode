/**
 * **********************************************************************
 * HONGLING CAPITAL CONFIDENTIAL AND PROPRIETARY
 * <p>
 * COPYRIGHT (C) HONGLING CAPITAL CORPORATION 2012
 * ALL RIGHTS RESERVED BY HONGLING CAPITAL CORPORATION. THIS PROGRAM
 * MUST BE USED  SOLELY FOR THE PURPOSE FOR WHICH IT WAS FURNISHED BY
 * HONGLING CAPITAL CORPORATION. NO PART OF THIS PROGRAM MAY BE REPRODUCED
 * OR DISCLOSED TO OTHERS,IN ANY FORM, WITHOUT THE PRIOR WRITTEN
 * PERMISSION OF HONGLING CAPITAL CORPORATION. USE OF COPYRIGHT NOTICE
 * DOES NOT EVIDENCE PUBLICATION OF THE PROGRAM.
 * HONGLING CAPITAL CONFIDENTIAL AND PROPRIETARY
 * ***********************************************************************
 */
package com.xc.leetcode.medium;

/**
 * @author xiachuan at 2017/1/17 10:31。
 */


public class SolutionOfAddTwoNumbers {

    public ListNode method1(ListNode listNode1, ListNode listNode2) {
        ListNode c1 = listNode1;
        ListNode c2 = listNode2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }


    public ListNode method2(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = new ListNode(0);

            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;

            cur.val = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = cur;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }


    public ListNode method3(ListNode l1,ListNode l2){
        ListNode ln1 = l1, ln2 = l2, head = null, node = null;
        int carry = 0, remainder = 0, sum = 0;
        head = node = new ListNode(0);

        while(ln1 != null || ln2 != null || carry != 0) {
            sum = (ln1 != null ? ln1.val : 0) + (ln2 != null ? ln2.val : 0) + carry;
            carry = sum / 10;
            remainder = sum % 10;
            node = node.next = new ListNode(remainder);
            ln1 = (ln1 != null ? ln1.next : null);
            ln2 = (ln2 != null ? ln2.next : null);
        }
        return head.next;
    }

    /**
     * 判断2个非空链表 {@link ListNode} 元素是否相等.
     *
     * @param listNode1
     * @param listNode2
     * @return
     */
    public boolean equals(ListNode listNode1, ListNode listNode2) {
        boolean match = true;

        ListNode c1 = listNode1;
        ListNode c2 = listNode2;
        while (c1 != null && c2 != null) {
            if (c1.val != c2.val) {
                match = false;
                return match;
            }

            c1 = c1.next;
            c2 = c2.next;
        }

        return match;
    }

    public String StringOfNode(ListNode listNode) {
        ListNode node = listNode;
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null) {
            stringBuilder.append(node.val);
            node = node.next;

            if (node != null) {
                stringBuilder.append(" -> ");
            }
        }

        return stringBuilder.toString();
    }
}

