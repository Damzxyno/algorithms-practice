import java.math.BigInteger;

public class BigIntegerBitOROperator {
    /**
     * https://www.codewars.com/kata/56cafdabc8cfcc3ad4000a2b/train/java
     *
     */

    public static void main(String[] args) {
        int n = 49;
        int i = 0;
        int solution = 0;
        while (i<= n)
            solution = solution | ++i;
        System.out.println(solution);

        int bitSize = Integer.toBinaryString(n).length();
        System.out.println(bitSize);
        System.out.println(Math.pow(2, bitSize) - 1);

        BigInteger h = BigInteger.valueOf(n);
        System.out.println(BigInteger.valueOf(2).pow(h.bitLength()).subtract(BigInteger.valueOf(1)));
    }
}
