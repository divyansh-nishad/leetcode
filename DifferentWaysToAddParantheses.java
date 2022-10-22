public class DifferentWaysToAddParantheses {
    public List<Integer> diffWaysToCompute(String exp) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '*' || ch == '-') {
                String left = exp.substring(0, i);
                String right = exp.substring(i + 1);
                List<Integer> leftcal = diffWaysToCompute(left);
                List<Integer> rightcal = diffWaysToCompute(right);
                for (int p1 : leftcal) {
                    for (int p2 : rightcal) {
                        int c = 0;
                        switch (ch) {
                            case '+':
                                c = p1 + p2;
                                break;
                            case '*':
                                c = p1 * p2;
                                break;
                            case '-':
                                c = p1 - p2;
                                break;
                        }
                        ans.add(c);
                    }
                }
            }
        }
        if (ans.size() == 0) {
            ans.add(Integer.valueOf(exp));
        }
        return ans;
    }

}
