class Solution {
    public List<Integer> grayCode(int n) {
        int iterate=1<<n;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<iterate;i++){
            list.add(i^(i>>1));
        }
        return list;
    }
}