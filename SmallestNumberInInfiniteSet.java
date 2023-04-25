public class SmallestNumberInInfiniteSet {
    int arr[] = new int[1001];

    public SmallestInfiniteSet() {
        Arrays.fill(arr,1);
    }

    public int popSmallest() {
        for (int i = 1; i < 1001; i++) {
            if (arr[i] != 0) {
                arr[i] = 0;
                return i;
            }
        }
        return -1;
    }

    public void addBack(int num) {
        arr[num] = num;
    }

}
