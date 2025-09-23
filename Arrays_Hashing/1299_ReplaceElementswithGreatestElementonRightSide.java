class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int[] res= new int[n];
        if(arr.length==1){
            res[0]=-1;
        }
        int maxSoFar=-1;
        for(int i=arr.length-1;i>=0;i--){
            res[i]=maxSoFar;
            if(arr[i]>maxSoFar){
                maxSoFar=arr[i];
            }
        }
        return res;
    }
}