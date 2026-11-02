class Solution {
    public int longestPalindrome(String s) {
        boolean countedOne=false;
        int count=0;
        int [] freq=new int[58];
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'A';
            freq[index]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i] %2!=0 && !countedOne) {count+=freq[i];
            countedOne=true;}
            else if(freq[i] %2!=0 && countedOne){
                 count+=(freq[i]-1);
            } 
            else 
            count+=freq[i];
              
        }
        return count;
    }
}