class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder st1=new StringBuilder();
         StringBuilder st2=new StringBuilder();
         for(String w:word1){
            st1.append(w);
         }
         for(String w:word2){
            st2.append(w);
         }
         return st1.toString().equals(st2.toString());
    }
}