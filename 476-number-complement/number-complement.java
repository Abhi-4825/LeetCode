class Solution {
    public int findComplement(int num) {
      int mask=0;
      int temp=num;
      while(num>0){
         mask<<=1;
        mask|=1;
       
        num>>=1;
      }
      return temp^mask;
    }
}