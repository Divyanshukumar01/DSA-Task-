import java.util.Arrays;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] newarr = new int[2];
        int[] oldarr = { -1, -1 };
        int c = 0;

        
        if (nums.length == 1) {
            if (nums[0] == target) {
                return new int[] { 0, 0 };
            } else {
                return oldarr;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                newarr[0] = i;
                c++;
                break;
            }
        }
        if (c == 1) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == target) {
                    newarr[1] = i;
                    return newarr;
                }
            }
        }
        return oldarr;
    }
}
