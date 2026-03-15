class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // Base case: the string has reached the maximum length (2 * n)
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Add an open parenthesis if we haven't reached the limit
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        
        // Add a close parenthesis if it can match an open one
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}