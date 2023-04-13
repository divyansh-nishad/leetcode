public class ValidateStackSequence {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int ind = 0;
        for (int x : pushed) {
            st.push(x);
            while (!st.isEmpty() && st.peek() == popped[ind]) {
                st.pop();
                ind++;
            }
        }
        return st.isEmpty();
    }

}
