public class DesignHashset {
    int num[];

    public MyHashSet() {
        num = new int[31251];
    }

    public void add(int key) {
        num[getIdx(key)] |= getMask(key);
    }

    public void remove(int key) {
        num[getIdx(key)] &= (~getMask(key));
    }

    public boolean contains(int key) {
        return (num[getIdx(key)] & getMask(key)) != 0;
    }

    private int getIdx(int key) {
        return (key / 32);
    }

    private int getMask(int key) {
        key %= 32;
        return (1 << key);
    }

}
