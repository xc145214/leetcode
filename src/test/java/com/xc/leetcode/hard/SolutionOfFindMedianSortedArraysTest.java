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
package com.xc.leetcode.hard;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * XXXXXXXXXXXXXXXXXXXXX
 *
 * @author xiachuan at 2017/2/15 13:58。
 */

public class SolutionOfFindMedianSortedArraysTest extends TestCase {

    int[] A, B, C, D;
    double median1, median2;
    SolutionOfFindMedianSortedArrays solution;


    @Before
    public void setUp() throws Exception {
        A = new int[]{1, 3};
        B = new int[]{2};

        median1 = 2.0;

        C = new int[]{1, 2};
        D = new int[]{3, 4};


        median2 = 2.5;

        solution = new SolutionOfFindMedianSortedArrays();
    }

    @Test
    public void testMethod1() throws Exception {

        Assert.assertTrue(median1 == solution.method1(A, B));
        Assert.assertTrue(median2 == solution.method1(C, D));


    }


    @Test
    public void testMethod2() throws Exception {

        Assert.assertTrue(median1 == solution.method2(A, B));
        Assert.assertTrue(median2 == solution.method2(C, D));

    }

    @Test
    public void testMethod3() throws Exception {

        Assert.assertTrue(median1 == solution.method3(A, B));
        Assert.assertTrue(median2 == solution.method3(C, D));

    }
}


