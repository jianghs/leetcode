package easy.a13_maximum_subarray;
/**
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int cur = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++){
            cur = Math.max(nums[i], cur + nums[i]);
            res = Math.max(res, cur);
        }
        return res;
    }

    public static void main(String[] args) {
        MaximumSubarray t = new MaximumSubarray();
        int[] nums = {1,2,3};
        System.out.println(t.maxSubArray(nums));
    }
}
