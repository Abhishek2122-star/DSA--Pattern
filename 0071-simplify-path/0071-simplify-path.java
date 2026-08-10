import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] symbols = path.split("/");

        for (String symbol : symbols) {
            // Ignore empty strings (from multiple slashes like "//") and "." (current directory)
            if (symbol.isEmpty() || symbol.equals(".")) {
                continue;
            } else if (symbol.equals("..")) {
                // Go up one directory level if stack is not empty
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Push valid directory names onto the stack
                stack.push(symbol);
            }
        }

        // Reconstruct the canonical path
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}