class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        int incCount=1;
        int decCount=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]<=nums[i]){
                incCount++;
            }
        }
        for(int i=1;i<n;i++){
            if(nums[i-1]>=nums[i]){
                decCount++;
            }
        }
        if(incCount==n || decCount==n){
            return true;
        }
        //  System.out.println(incCount);
        return false;
    }
}