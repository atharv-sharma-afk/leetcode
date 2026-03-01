import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map<Integer, Boolean> exploredMap = new HashMap<>();

        for (int num : nums) {
            exploredMap.put(num, false);   
        }

        for (int num : nums) {

            if (exploredMap.get(num)) continue;   // skip already explored

            int currentLength = 1;   // FIX: declare variable
            exploredMap.put(num, true);   // mark starting num explored

            int nextNum = num + 1;
            while (exploredMap.containsKey(nextNum) && !exploredMap.get(nextNum)) {
                currentLength++;
                exploredMap.put(nextNum, true);   // FIX: true not Boolean.True
                nextNum++;
            }

            int prevNum = num - 1;
            while (exploredMap.containsKey(prevNum) && !exploredMap.get(prevNum)) {
                currentLength++;
                exploredMap.put(prevNum, true);
                prevNum--;
            }

            longestLength = Math.max(currentLength, longestLength);
        }

        return longestLength;
    }
}