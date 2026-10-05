class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int res=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(res);
                res=0;
            }
            else{
                res=st.pop()+Math.max(2*res,1);
            }
        }
        return res;
    }
}