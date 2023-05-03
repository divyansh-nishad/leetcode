public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> ind1 = new HashMap<>();
        HashMap<Integer, Integer> ind2 = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            ind1.put(nums1[i], i);
        }
        for (int i = 0; i < nums2.length; i++) {
            ind2.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (!ind2.containsKey(nums1[i])) {
                if (!list1.contains(nums1[i]))
                    list1.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (!ind1.containsKey(nums2[i])) {
                if (!list2.contains(nums2[i]))
                    list2.add(nums2[i]);
            }
        }
        return Arrays.asList(list1, list2);
    }

}
