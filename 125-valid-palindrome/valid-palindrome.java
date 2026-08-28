class Solution {
    public boolean isPalindrome(String s) {
     String text=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
     int start=0;
     int end=text.length()-1;
     while(start<=end){
        if(text.charAt(start)!=(text.charAt(end))) return false;
        end--;
        start++;
     }
     return true;
    }
}