class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> list=new HashSet<>();
        Set<String> set=new HashSet<>();
       
        for(int i=0;i<=s.length()-10;i++){
           int end=i+10;
           String sub=s.substring(i,end);
           if(!set.add(sub)) list.add(sub);
        }
        return new ArrayList<>(list);

     }
}