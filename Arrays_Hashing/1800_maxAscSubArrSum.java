class Solution {
    public int maxAscendingSum(int[] nums) {
        int currSum=nums[0], maxSofar= nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<= nums[i-1]){
                currSum=0;
            }
            currSum+=nums[i];
            maxSofar=Math.max(currSum, maxSofar);
        }
        return maxSofar;
        
    }
}