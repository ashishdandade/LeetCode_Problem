class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map= new HashMap<>();
        for(String s:arr){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        for(String x:arr){
            if(map.get(x)==1){
                k--;
            }
            if(k==0){
                return x;
            }
        }
        return "";
    }
}