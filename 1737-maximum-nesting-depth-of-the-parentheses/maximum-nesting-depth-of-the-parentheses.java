class Solution {
    public int maxDepth(String s) {
     int count=0;
       int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') count++;
            if(c==')') {
            max=Math.max(max,count);
            count--;}
        }
        return max;
    }
}