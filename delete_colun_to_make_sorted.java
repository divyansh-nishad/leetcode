public class delete_colun_to_make_sorted {
    public int minDeletionSize(String[] A) {
        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j - 1].charAt(i) > A[j].charAt(i)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

}
