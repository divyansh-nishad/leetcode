public class time_based_key_value_store {
    private Map<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map=new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new TreeMap<>());
        }
        map.get(key).put(timestamp, value);

    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> tm = map.get(key);
        if (tm == null)
            return "";
        Integer fl = tm.floorKey(timestamp);
        if (fl == null)
            return "";
        return tm.get(fl);

    }

}
