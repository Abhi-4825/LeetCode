class Solution {
    public String simplifyPath(String path) {
        String[] s=path.split("/");
        Stack<String> st=new Stack<>();
        for(String string:s){
            if(string.equals("..")){
                if(!st.isEmpty())st.pop();

            }
            else if(!string.isEmpty()  && !string.equals("."))st.push(string);
        }
        StringBuilder sb=new StringBuilder();
        for(String string:st){
            sb.append("/").append(string);
        }
        return sb.length()>0 ? sb.toString():"/";
        
    }
}