public class final_value_after_perfroming_operations {
    public int finalValueAfterOperations(String[] operations) {
        int l = operations.length;
        int x = 0;
        for (int i = 0; i < l; i++) {
            String k = operations[i];
            if (k.equalsIgnoreCase("++X"))
                x++;
            else if (k.equalsIgnoreCase("--X"))
                x--;
            else if (k.equalsIgnoreCase("X++"))
                x++;
            else if (k.equalsIgnoreCase("X--"))
                x--;

        }
        return x;

    }
}
