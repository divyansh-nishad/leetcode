public class CanPlaceFlower {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int l = arr.length;
        boolean flg[] = new boolean[l];
        int x = n;
        if (n == 0)
            return true;
        if (l == 1 && arr[0] == 0 && n == 1)
            return true;
        for (int i = 1; i < l - 1; i++) {
            if (arr[i] == 0 && arr[i - 1] == 0 && arr[i + 1] == 0) {
                flg[i] = true;
            }
        }
        if (l > 1) {
            if (arr[0] == 0 && arr[1] == 0)
                flg[0] = true;
            if (arr[l - 1] == 0 && arr[l - 2] == 0)
                flg[l - 1] = true;
        }
        for (int i = 0; i < l; i++) {
            if (flg[i] == true) {
                x--;
                if (x == 0) {
                    return true;
                }
                flg[i] = false;
                if (i + 1 < l)
                    flg[i + 1] = false;
                if (i - 1 >= 0)
                    flg[i - 1] = false;
            }
        }
        return false;
    }

}
