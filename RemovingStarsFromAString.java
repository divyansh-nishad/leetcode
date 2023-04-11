public class RemovingStarsFromAString {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*')
                stack.pop();
            else
                stack.push(s.charAt(i));
        }

        char[] ans = new char[stack.size()];
        int j = ans.length - 1;
        while (!stack.isEmpty())
            ans[j--] = stack.pop();
        return new String(ans);
    }

}
