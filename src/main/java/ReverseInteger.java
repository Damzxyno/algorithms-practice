public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }
//    public static int reverse(int x) {
//        int original = x;
//        int sign = (int) Math.signum(x);
//        long reversed = 0;
//        x = Math.abs(x);
//        while (x > 0){
//            int lastDigit = x%10;
//            reversed = reversed*10 + lastDigit;
//            x /= 10;
//        }
//        if (sign * reversed > Integer.MAX_VALUE) return 0;
//        if (sign * reversed < Integer.MIN_VALUE) return 0;
//        return (int) (sign * reversed);
//
//
//    }
public static int reverse(int x) {
    int sign = (int) Math.signum(x);
    long num = Math.abs(x) * -1;
    System.out.println(num);
    String reversed = new StringBuilder().append(num).reverse().toString();
    System.out.println(reversed);
    long reversedLong = sign * Long.parseLong(reversed);
    if (reversedLong > Integer.MAX_VALUE) return 0;
    else if (reversedLong < Integer.MIN_VALUE) return 0;
    return (int) reversedLong;
}
}
