public class minimum_bit_flips_to_convert_number {
    int xor = start ^ goal;
    int count=0;while(xor>0)
    {
        count++;
        xor = xor & (xor - 1);
    }return count;

}
