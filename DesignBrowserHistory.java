public class DesignBrowserHistory {
    String[] arr;
    int pres, right;

    public BrowserHistory(String homepage) {
        arr = new String[5000];
        pres=0; right=0;
        arr[pres] = homepage;
    }

    public void visit(String url) {
        arr[++pres] = url;
        right = pres;
    }

    public String back(int steps) {
        pres = Math.max(pres - steps, 0);
        return arr[pres];
    }

    public String forward(int steps) {
        pres = Math.min(pres + steps, right);
        return arr[pres];
    }

}
