class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> list=new ArrayList<>();
            long val=1;
            for(int j=0;j<=i;j++){
                list.add((int)val);
                val=val*(i-j)/(j+1);
             
            }
            l.add(list);
        }
        return l;
    }
 
}