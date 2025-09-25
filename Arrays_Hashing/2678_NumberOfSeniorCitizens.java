class Solution {
    public int countSeniors(String[] details) {
       int res=0;
       for(String d:details){
        if(Integer.parseInt(d.substring(11,13))>60){
            res++;
        }
       } 
       return res;
    }
}