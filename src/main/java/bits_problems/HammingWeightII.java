package bits_problems;

public class HammingWeightII {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(5));
        System.out.println(hammingWeight(5));
    }


    public static int hammingWeight(int n) {
        int count = 0;
        int mask = 1;

        for (int i = 0; i < 32; i++){
            int number = n & mask;
            System.out.println(number);
            if ((n & mask) != 0){
                count++;
            }
            mask <<= 1;
        }
        return count;
    }
}
