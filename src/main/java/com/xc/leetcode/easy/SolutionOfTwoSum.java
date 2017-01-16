package com.xc.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/16.
 */
public class SolutionOfTwoSum {

    /**
     * @param nums
     * @param target
     * @return
     */
    public int[] method1(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i + 1);
        }
        return result;
    }


    public int[] method2(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (tracker.containsKey(nums[i])) {
                int left = tracker.get(nums[i]);
                return new int[]{left + 1, i + 1};
            } else {
                tracker.put(target - nums[i], i);
            }
        }
        return new int[2];
    }

    public int[] method3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer diff = target - nums[i];
            if (map.containsKey(diff)) {
                int[] toReturn = {map.get(diff) + 1, i + 1};
                return toReturn;
            }

            map.put(nums[i], i);
        }

        return null;
    }


}
