class Solution {
    public String sortSentence(String s) {
       String[] word=s.split(" ");
       String [] result =new String[word.length];
       for(String w:word){
         int lastPos=w.charAt(w.length()-1)-'1';
         result[lastPos]=w.substring(0,w.length()-1);
       }
       return String.join(" ",result);

    }
}