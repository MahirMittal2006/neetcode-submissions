class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
            
                char top=st.peek();

                if(!st.isEmpty())
                {
                    char c = s.charAt(i);
                    if((c==')' && top=='(') || (c=='}' && top=='{') || (c==']' && top=='['))
                    {
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
