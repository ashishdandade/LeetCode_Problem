class Solution {
    public boolean divideArray(int[] nums) {
        System.out.println(nums.length);
        Set<Integer> unqElement= new HashSet<>();
       for(int x:nums){
            if(!unqElement.contains(x)){
                unqElement.add(x);
            }
            else{
                unqElement.remove(x);
            }
       }
       return unqElement.isEmpty();
    }
}