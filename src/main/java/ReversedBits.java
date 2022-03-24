//public class ReversedBits {
//    public static void main(String[] args) {
//        System.out.println(reverseBits(10_100_101_000_001_111_010_011_100L));
//
//
//    }
//
//    public static int reverseBits(long n) {
//        String nStr = String.valueOf(n);
//        String completeBitN = "0".repeat(32 - nStr.length()) + nStr;
//        String reversedBit = new StringBuilder().append(completeBitN).reverse().toString();
//        return convertToInt(reversedBit);
//    }
//
//    public static int convertToInt(String binary){
//        int result = 0;
//        for (int i = 0; i < binary.length() - 1; i++)
//            result += (binary.charAt(i) - '0') * (int) Math.pow(2, 32 - 1);
//        return result;
//    }
//}
