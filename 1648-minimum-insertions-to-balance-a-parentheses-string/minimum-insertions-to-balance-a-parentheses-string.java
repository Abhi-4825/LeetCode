class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int neededRight = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                neededRight += 2;
                // If neededRight is odd, it means we had an unpaired single ')'
                if (neededRight % 2 != 0) {
                    insertions++;    // Insert 1 ')' to complete existing pair
                    neededRight--;   // Balance needed right parens
                }
            } else { // c == ')'
                neededRight--;
                // We encountered a ')' without a matching '(' beforehand
                if (neededRight < 0) {
                    insertions++;    // Insert 1 '(' on the left
                    neededRight += 2; // Adding '(' increases needed right parens by 2
                }
            }
        }

        return insertions + neededRight;
    }
}