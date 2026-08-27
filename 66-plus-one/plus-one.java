class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        int k=1;
        List<Integer> num=new ArrayList<>();
        while (i>=0 || k>0){
            if(i>=0){
            k+=digits[i];
            i--;}
            num.add(k%10);
            k/=10;
        }
        int [] res=new int[num.size()];
        for(int j=num.size()-1;j>=0;j--){
              res[num.size()-j-1]=num.get(j);
        }
        return res;
    }
}