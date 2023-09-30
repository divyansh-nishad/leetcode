import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) 
    {
        int n1, n2;
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<tokens.length;i++)
        {
            if(Character.isDigit(tokens[i].charAt(0))||(tokens[i].length()>1))
            {
                st.push(Integer.parseInt(tokens[i]));
            }
            else
            {
                n2=st.pop();
                n1=st.pop();
                if(tokens[i].equals("*"))
                    st.push(n1*n2);
                else if(tokens[i].equals("/"))
                    st.push(n1/n2);
                else if(tokens[i].equals("+"))
                    st.push(n1+n2);
                else if(tokens[i].equals("-"))
                    st.push(n1-n2);
            }
        } 
        int val=st.pop();
        System.out.println(val);
        return val;  
    }
}
