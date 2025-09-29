class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String>unique= new HashSet<>();
        for(String s:emails){
            String[] parts= s.split("@");
            String local= parts[0];
            String domain= parts[1];
            local= local.split("\\+")[0];
            local= local.replace(".","");
            unique.add(local+"@"+domain);
          
            
        }
          return unique.size();
    }
}