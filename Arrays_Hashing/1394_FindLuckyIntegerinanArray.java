class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freq= new HashMap<>();
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int count=Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry:freq.entrySet()){
            if(entry.getKey().equals(entry.getValue())){
                if(entry.getKey()>count){
                    count=entry.getKey();
                }
            }
        }
        return count<1?-1:count;
    }
}
//-----------------------------------------------------
                        Freq arr solution
//-----------------------------------------------------
class Solution {
    public int findLucky(int[] arr) {

       int[] freq = new int[501];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        int result =-1;

        for(int i=1;i<freq.length;i++){
            if(freq[i]==i)
              result =i;
        }

        return result;




    }
}