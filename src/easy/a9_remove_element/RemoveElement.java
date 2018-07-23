package easy.a9_remove_element;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        // 排序
        int i = 0;
        while (i< nums.length) {
            if (nums[i] == val) {
                if (i == nums.length - 1) {
                    break;
                }

                int j = i + 1;
                while (j < nums.length) {
                    if (j == nums.length - 1) {
                        break;
                    }
                    if (nums[j] != val) {
                        break;
                    }
                    j++;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
        }

        // 取值
        int t = 0;
        while (t < nums.length && nums[t] != val) {
            t ++;
        }
        return t;
    }



    public static void main(String[] args) {
        RemoveElement t = new RemoveElement();
        int[] nums = {3,2,2,3};
        t.removeElement(nums,3);
    }
}





