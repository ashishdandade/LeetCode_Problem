class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int ans= (nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]);
        return ans;
    }
}

/// optimal approach is take four min1 min2 max1 max2 loop throught the arrays and calculate
public class Solution {
    public int maxProductDifference(int[] nums) {
        int max1 = 0, max2 = 0;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        return (max1 * max2) - (min1 * min2);
    }
}