import java.util.Arrays;

public class GapInPrimes {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(gap(6,100,110)));

    }
    public static long[] gap(int g, long m, long n) {
        long [] result = null;
        for (var i = m; i < n - g; i++){
            boolean found = true;
            if (isPrime(i) && isPrime(i+g)){
                for (var j = i + 1; j < (i + g) ; j++){
                    System.out.println(j);
                    if (isPrime(j)){
                        found = false;
                        break;
                    }
                }
                    if (found){
                        result = new long [2];
                        result[0] = i;
                        result[1] = i + g;
                        break;
                    }
            }
        }
        return result;
    }

    public static boolean isPrime(long num){
        for (var i = 2; i <= Math.sqrt(num); i++){
            if (num%i == 0) return false;
        }
        return true;
    }
}
