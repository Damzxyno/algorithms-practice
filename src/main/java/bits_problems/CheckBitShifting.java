package bits_problems;

public class CheckBitShifting {
    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String s) {
        if (s.isBlank()) return 0;
        StringBuilder result = new StringBuilder();
        char [] sArr = s.trim().toCharArray();
        int index = 0;
        int sign = 1;

        if (sArr[0] == '+' || sArr[0] == '-'){
            sign = (sArr[0] == '+') ? 1: -1;
            index++;
        }

        for (int i = index; i < sArr.length; i++){
            char charac = sArr[i];
           if (!(charac >= '0' && charac <= '9')) break;
            result.append(charac);
        }

        String solution = result.toString();
        if (solution.isBlank()) return  0;
        long ans = Long.parseLong(solution);
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return sign * (int) ans;
    }
}
