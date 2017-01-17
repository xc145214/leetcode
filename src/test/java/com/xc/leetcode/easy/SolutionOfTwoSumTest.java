package com.xc.leetcode.easy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/1/16.
 */
public class SolutionOfTwoSumTest {

    private SolutionOfTwoSum solutionOfTwoSum;

    int[] nums = new int[]{2, 7, 11, 15};
    int target = 13;
    int[] answer = new int[]{1, 3};

    @Before
    public void setUp() throws Exception {
        System.out.println("set up before test;");
        solutionOfTwoSum = new SolutionOfTwoSum();
    }

    @After
    public void tearDown() throws Exception {
        solutionOfTwoSum = null;

    }

    @org.junit.Test
    public void method1() throws Exception {
        int[] result1 = solutionOfTwoSum.method1(nums, target);
        Arrays.sort(result1);
        Assert.assertEquals(true, Arrays.equals(result1, answer));
    }

    @Test
    public void method2() throws Exception {
        int[] result2 = solutionOfTwoSum.method2(nums, target);
        Arrays.sort(result2);
        Assert.assertEquals(true, Arrays.equals(result2, answer));
    }


    @Test
    public void method3() throws Exception {
        int[] result3 = solutionOfTwoSum.method2(nums, target);
        Arrays.sort(result3);
        Assert.assertEquals(true, Arrays.equals(result3, answer));
    }
}
