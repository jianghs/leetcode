package easy.a1_two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 *  Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *  You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *  Given nums = [2, 7, 11, 15], target = 9,
 *  Because nums[0] + nums[1] = 2 + 7 = 9,
 *  return [0, 1].
 */

public class TwoSum {

    /**
     * solution1 : 双重循环
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     * */

    public static int[] solution1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * solution2 : two-pass hash table
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     * */
    public static int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i ++) {
            int otherValue = target - nums[i];
            // 如果Map中存在另一个value 并且该value 对应的key不是当前i
            if (map.containsKey(otherValue) && map.get(otherValue) != i) {
                return new int[] {i, map.get(otherValue)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * solution3 : one-pass hash table
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     * */
    public static int[] solution3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            int otherValue = target - nums[i];
            // 如果Map中存在另一个value
            if (map.containsKey(otherValue)) {
                return new int[] {i, map.get(otherValue)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public int[] twoSum(int[] nums, int target) {
        return solution3(nums, target);
    }

    public static void main(String[] args) {
        TwoSum two_sum = new TwoSum();
        int[] nums = {55 ,7 ,89 , 9, 6, 22, 45, 1, 11};
        int target = 51;
        int[] result = two_sum.twoSum(nums, target);
        System.out.println(result[0] + " , " + result[1]);
    }
}
