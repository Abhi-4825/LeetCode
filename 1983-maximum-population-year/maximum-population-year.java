class Solution {
    public int maximumPopulation(int[][] logs) {
        int [] count =new int[101];
        for(int[] log:logs){
            count[log[0]-1950]++;
            count[log[1]-1950]--;
        } 
        int pop=0;
        int max=0;
        int year=1950;
        for(int i=0;i<101;i++){
           pop+=count[i];
           if(pop>max){
            max=pop;
            year=1950+i;
           }

        }
        return year;
    }

}