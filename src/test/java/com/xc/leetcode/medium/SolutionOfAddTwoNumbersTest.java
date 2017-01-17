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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 *  @author xiachuan at 2017/1/17 10:42。
 */

public class SolutionOfAddTwoNumbersTest {

    ListNode listNode1;
    ListNode listNode2;
    ListNode target;

    SolutionOfAddTwoNumbers solution;

    @Before
    public void setUp() throws Exception {
        System.out.println("data ready!");

        listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);

        listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);

        target = new ListNode(7);
        target.next = new ListNode(0);
        target.next.next = new ListNode(8);

        solution = new SolutionOfAddTwoNumbers();
    }

    @Test
    public void testMethod1() throws Exception {

        ListNode listNode = solution.method1(listNode1,listNode2);
        Assert.assertTrue(solution.equals(target, listNode));

    }

    @Test
    public void testMethod2() throws Exception {
        ListNode listNode = solution.method2(listNode1, listNode2);

        Assert.assertTrue(solution.equals(target, listNode));
    }

    @Test
    public void testMethod3() throws Exception {
        ListNode listNode = solution.method3(listNode1, listNode2);

        Assert.assertTrue(solution.equals(target, listNode));
    }

    @Test
    public void testEqual() throws Exception {

        ListNode listNode = new ListNode(7);
        listNode.next = new ListNode(0);
        listNode.next.next = new ListNode(8);

        Assert.assertTrue(solution.equals(target, listNode));

        System.out.println("first : " + solution.StringOfNode(listNode));
        System.out.println("second : "+solution.StringOfNode(target));

    }
}

