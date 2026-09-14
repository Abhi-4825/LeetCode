class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            
            if (c == 'G') {
                sb.append('G');
            } else if (c == '(' && i + 1 < command.length() && command.charAt(i + 1) == ')') {
                sb.append('o');
                i++; 
            } else if (c == '(' && i + 1 < command.length() && command.charAt(i + 1) == 'a') {
                sb.append("al");
                i += 3;
            }
        }
        
        return sb.toString();
    }
}