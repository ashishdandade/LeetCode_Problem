class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set= new HashSet<>();
        ArrayList<Integer>res= new ArrayList<>();
        for(int x:nums){
            if(set.contains(x)){
                res.add(x);
            }
            set.add(x);
        }
        return res;
    }
}