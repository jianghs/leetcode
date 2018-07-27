package easy.a11_search_insert_position;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        if (nums[0] >= target) {
            return 0;
        }

        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        int i = 0;
        for (; i < nums.length - 1;i ++) {
            if (nums[i] < target && target <= nums[i+1]) {
                break;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        SearchInsertPosition t = new SearchInsertPosition();
        int[] nums = {1};
        int target = 1;
        System.out.println(t.searchInsert(nums, target));
    }
}
