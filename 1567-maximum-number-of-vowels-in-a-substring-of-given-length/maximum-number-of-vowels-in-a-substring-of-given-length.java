class Solution {
    public int maxVowels(String s, int k) {
        int start=0;
        int end=start+k;

        int sum=0;
        for(int i=0;i<end;i++){
           if(isVowel(s.charAt(i))) sum++;
        }
        int maxSum=sum;
        while(end<s.length()){
            if(isVowel(s.charAt(end)))sum++;
             if(isVowel(s.charAt(start)))sum--;
             start++;
             end++;
             maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
    private boolean isVowel(char c){
        return c=='a'||c=='e'|| c=='i' || c=='o' || c=='u';
    }
}