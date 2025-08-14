class Solution {
    public String decodeString(String s) {

        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> s1 = new Stack<>();
        StringBuilder str = new StringBuilder();
        int n = 0;
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                st.push(n);
                n = 0;
                s1.push(str);
                str = new StringBuilder();
            } else if (c == ']') {
                int k = st.pop();
                StringBuilder temp = str;
                str = s1.pop();
                while (k-- > 0) {
                    str.append(temp);
                }
            } else {
                str.append(c);
            }
        }

        return str.toString();
        
    }
}