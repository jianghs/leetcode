package easy.a8_remove_duplicates_from_sorted_array;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int length = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[length] = nums[i+1];
                length ++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray t = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(t.removeDuplicates(nums));
    }
}
