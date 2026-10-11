class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<score.length;i++){
            m.put(score[i],i);
        }
        Arrays.sort(score);
        String[] ans=new String[score.length];
          int i=1;
        for(int j=score.length-1;j>=0;j--){
          
           String rank=getRank(i);

            ans[m.get(score[j])]=rank;
            i++;
        }
        return ans;
    }
    private String getRank(int pos){
        String rank;
        switch(pos){
            case 1: {rank="Gold Medal";
            break;}
            case 2:{
                rank="Silver Medal";
                break;
            }
            case 3: {
                rank="Bronze Medal";
                break;
            }
            default:
               rank=String.valueOf(pos);
                   

        }
        return rank;
    }
}