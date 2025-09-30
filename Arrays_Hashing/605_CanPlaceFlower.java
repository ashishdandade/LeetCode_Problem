class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int x= flowerbed.length;
        for(int i=0;i<x;i++){
            int left= i==0?0:flowerbed[i-1];
            int right= i== x-1 ? 0:flowerbed[i+1];
            if(left+flowerbed[i]+right==0){
                flowerbed[i]=1;
                n--;
            }
        }
        return n<=0;
    }
}