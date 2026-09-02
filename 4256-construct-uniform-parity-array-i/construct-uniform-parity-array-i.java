class Solution {
    public boolean uniformArray(int[] nums1) {
        // we are going to check if all odd or odd even case possible 

        boolean[] odd=new boolean[nums1.length];
        boolean[] even =new boolean[nums1.length];

        for(int i=0;i<nums1.length;i++){
            if((nums1[i]&1)==1) odd[i]=true;
            else{
                for(int j=0;j<nums1.length;j++){
                    if(j!=i && ((nums1[i]-nums1[j])&1)==1)odd[i]=true;
                }
            }
            if((nums1[i]&1)==0) even[i]=true;
            else{
                for(int j=0;j<nums1.length;j++){
                 if(j!=i && ((nums1[i]-nums1[j])&1)==0)even[i]=true;
                }
            }
        }
        boolean allOdd=true;
        boolean allEven=true;
        for(int i=0;i<nums1.length;i++){
            if(!odd[i])allOdd=false;
            if(!even[i]) allEven=false;
        }
        return allOdd || allEven;



    }

}