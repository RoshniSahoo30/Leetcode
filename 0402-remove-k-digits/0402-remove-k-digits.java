class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length()) return "0";

        StringBuilder stack = new StringBuilder();

        for (char digit : num.toCharArray()) {
            while (stack.length() > 0 && stack.charAt(stack.length() - 1) > digit && k > 0) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(digit);
        }

        while (k > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }

        while (stack.length() > 1 && stack.charAt(0) == '0') {
            stack.deleteCharAt(0);
        }

        return stack.length() == 0 ? "0" : stack.toString();
    }
}
