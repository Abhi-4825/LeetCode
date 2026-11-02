class Solution {
    public int maxNumberOfBalloons(String text) {
      
        int [] count=new int[26];
        
        for(char c:text.toCharArray()){
            count[c-'a']++;
        }
        int b=count['b'-'a'];
        int a=count['a'-'a'];
        int l=count['l'-'a']/2;
        int o=count['o'-'a']/2;
        int n=count['n'-'a'];


        int min1=Math.min(b,a);
        int min2=Math.min(l,o);
        int min3=Math.min(min2,n);

        return Math.min(min1,min3);
    }

}