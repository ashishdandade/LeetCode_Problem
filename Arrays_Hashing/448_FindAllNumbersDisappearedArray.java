class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
       List<Integer> res= new ArrayList<>();
       Set<Integer> st= new HashSet<>();
       for(int x:nums){
        st.add(x);
       }
       for(int i=1;i<=n;i++){
        if(!st.contains(i)){
            res.add(i);
        }
       }
       return res;

    }
}