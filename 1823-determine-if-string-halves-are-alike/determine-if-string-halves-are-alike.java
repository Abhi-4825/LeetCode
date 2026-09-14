class Solution {
    public boolean halvesAreAlike(String s) {
        int mid=(s.length()/2 )-1;
        String half1=s.substring(0,mid+1);
        String half2=s.substring(mid+1);
        int count1=0;
        int count2=0;
        for(int i=0;i<half1.length();i++){
            char c1=half1.charAt(i);
            char c2=half2.charAt(i);
            if(c1=='a' || c1=='e' ||c1== 'i' ||c1== 'o' || c1=='u'||c1== 'A'||c1== 'E'|| c1=='I'||c1== 'O'||c1== 'U')
             count1++;
            if(c2=='a' || c2=='e' ||c2== 'i' ||c2== 'o' || c2=='u'||c2== 'A'||c2== 'E'|| c2=='I'||c2== 'O'||c2== 'U')
             count2++;
        }
        return count1==count2;

    }
}