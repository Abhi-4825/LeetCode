class Solution {
    public boolean checkIfPangram(String sentence) {
        int [] count=new int[26];
        for(int i=0;i<sentence.length();i++){
            int index=sentence.charAt(i)-'a';
            count[index]++;
        }
        for(int i=0;i<26;i++){
            if(count[i]==0) return false;
        }
        return true;
    }
}