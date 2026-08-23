class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        int allowedMask=0;
        for(int i =0;i<allowed.length();i++){
            allowedMask=allowedMask | (1<<allowed.charAt(i)-'a');
        }
        for(String word:words){
            int wordMask=0;
             for(int i =0;i<word.length();i++){
            wordMask=wordMask | (1<<word.charAt(i)-'a');
        }
        if((wordMask | allowedMask) ==allowedMask)
          count++;
        }
        return count;
    }
}