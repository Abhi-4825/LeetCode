class Solution {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";
        
        int lower = 0;
        int upper = 0;
        
        // Build bitmasks for lowercase and uppercase letters
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                lower |= (1 << (c - 'a'));
            } else {
                upper |= (1 << (c - 'A'));
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int bitPosition = Character.isLowerCase(c) ? (c - 'a') : (c - 'A');
            
            // If the character is missing its counterpart in the bitmasks
            if (((lower >> bitPosition) & 1) == 0 || ((upper >> bitPosition) & 1) == 0) {
                // Split around invalid character and solve recursively
                String sub1 = longestNiceSubstring(s.substring(0, i));
                String sub2 = longestNiceSubstring(s.substring(i + 1));
                
                return sub1.length() >= sub2.length() ? sub1 : sub2;
            }
        }
        
        return s;
    }
}