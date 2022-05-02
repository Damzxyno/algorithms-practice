package bits_problems;

public class HomeweightI {
    public static void main(String[] args) {
        System.out.println(hammingWeight(5));
    }
        // you need to treat n as an unsigned value
        public static int hammingWeight(int n) {
            String ones = Integer.toBinaryString(n).replace("0", "");
            return ones.length();
        }

}
