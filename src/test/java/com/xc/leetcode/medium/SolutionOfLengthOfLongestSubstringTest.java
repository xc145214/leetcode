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
 *
 *  @author xiachuan at 2017/1/17 16:52。
 */

public class SolutionOfLengthOfLongestSubstringTest {

    String s1,s2,s3;
    int a1,a2,a3;

    SolutionOfLengthOfLongestSubstring solution;

    @Before
    public void setUp() throws Exception {

        s1 = "abcabcbb";
        s2 = "bbbbb";
        s3 = "pwwkew";

        a1 = 3;
        a2 = 1;
        a3 = 3;

        solution = new SolutionOfLengthOfLongestSubstring();

        System.out.println("data setup!");

    }

    @Test
    public void testMethod1() throws Exception {

        Assert.assertEquals(solution.method1(s1),a1);
        Assert.assertEquals(solution.method1(s2),a2);
        Assert.assertEquals(solution.method1(s3), a3);
    }


    @Test
    public void testMethod2() throws Exception {
        Assert.assertEquals(solution.method2(s1),a1);
        Assert.assertEquals(solution.method2(s2),a2);
        Assert.assertEquals(solution.method2(s3),a3);
    }

    @Test
    public void testMethod3() throws Exception {
        Assert.assertEquals(solution.method3(s1),a1);
        Assert.assertEquals(solution.method3(s2),a2);
        Assert.assertEquals(solution.method3(s3),a3);
    }

    @Test
    public void testMethod4() throws Exception {
        Assert.assertEquals(solution.method4(s1),a1);
        Assert.assertEquals(solution.method4(s2),a2);
        Assert.assertEquals(solution.method4(s3),a3);
    }

}

