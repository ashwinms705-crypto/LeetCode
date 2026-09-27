class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<StringBuilder> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(sb);
                sb=new StringBuilder();
            }
            else if(c==')'){
                sb.reverse();
                StringBuilder prev=st.pop();
                prev.append(sb);
                sb=prev;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}