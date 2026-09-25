import java.util.*;

class Solution {
    public List<String> braceExpansionII(String expression) {
        Set<String> resultSet = evaluate(expression, 0, expression.length() - 1);
        List<String> resultList = new ArrayList<>(resultSet);
        Collections.sort(resultList);
        return resultList;
    }

    private Set<String> evaluate(String expr, int start, int end) {
        List<Set<String>> unionList = new ArrayList<>();
        Set<String> currentProduct = new HashSet<>();
        currentProduct.add("");

        int i = start;
        while (i <= end) {
            char ch = expr.charAt(i);

            if (ch == ',') {
                // End current product sequence and add to union list
                unionList.add(currentProduct);
                currentProduct = new HashSet<>();
                currentProduct.add("");
                i++;
            } else if (ch == '{') {
                // Find matching closing brace '}'
                int braceCount = 1;
                int j = i + 1;
                while (j <= end && braceCount > 0) {
                    if (expr.charAt(j) == '{') braceCount++;
                    else if (expr.charAt(j) == '}') braceCount--;
                    j++;
                }

                // Recursively solve inner expression
                Set<String> innerSet = evaluate(expr, i + 1, j - 2);
                currentProduct = multiply(currentProduct, innerSet);
                i = j;
            } else {
                // Single letter x -> Set { "x" }
                Set<String> letterSet = new HashSet<>();
                letterSet.add(String.valueOf(ch));
                currentProduct = multiply(currentProduct, letterSet);
                i++;
            }
        }

        unionList.add(currentProduct);

        // Combine all sets via Union
        Set<String> totalUnion = new HashSet<>();
        for (Set<String> set : unionList) {
            totalUnion.addAll(set);
        }

        return totalUnion;
    }

    private Set<String> multiply(Set<String> set1, Set<String> set2) {
        Set<String> res = new HashSet<>();
        for (String s1 : set1) {
            for (String s2 : set2) {
                res.add(s1 + s2);
            }
        }
        return res;
    }
}