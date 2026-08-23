import java.util.Arrays;

class Solution {
    public int[] sortByBits(int[] arr) {
        // Convert to Integer object array for custom comparator sorting
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Arrays.sort(boxed, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            if (countA != countB) {
                return countA - countB;
            }
            return a - b;
        });
        
        return Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
    }
}