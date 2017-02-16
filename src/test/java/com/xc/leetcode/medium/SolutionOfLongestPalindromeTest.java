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

import com.sun.xml.internal.ws.policy.AssertionSet;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * 参数化测试。
 *
 * @author xiachuan at 2017/2/15 15:59。
 */
@RunWith(Parameterized.class)
public class SolutionOfLongestPalindromeTest extends TestCase {

    String input;
    String output;
    SolutionOfLongestPalindrome solution= new SolutionOfLongestPalindrome();


    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"babad", "bab"},
                {"cbbd", "bb"}
        });
    }

    @Override
    public void setUp() throws Exception {
        System.out.println("数据准备！");
    }

    @Override
    public void tearDown() throws Exception {
        solution = null;
    }

    public SolutionOfLongestPalindromeTest(String input, String output) {
        this.input = input;
        this.output = output;
    }


    @Test
    public void testMethod1() throws Exception {
        System.out.println(input + "-----" + output);

        System.out.println(solution.method1(input));
    }
    @Test
    public void testMethod2() throws Exception {
        Assert.assertTrue(solution.method2(input).equals(output));

    }
}

