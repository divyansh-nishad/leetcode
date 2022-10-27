public class BinaryWatch {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for (int h=0; h<12; h++)
            for (int m=0; m<60; m++)
                if (Integer.bitCount(h * 64 + m) == turnedOn)
                    list.add(String.format("%d:%02d", h, m));
        return list;  
    }    
}
