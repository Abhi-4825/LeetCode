class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
       
        Map<String,String> m=new HashMap<>();
        for(List<String> l:knowledge){
            m.put(l.get(0),l.get(1));
        }
        StringBuilder sb=new StringBuilder();


        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                int j=i+1;
                while(s.charAt(j)!=')'){
                    j++;
                }
                String sub=s.substring(i+1,j);
                sb.append(m.getOrDefault(sub,"?"));
                i=j+1;
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }
         return sb.toString();

    }
}