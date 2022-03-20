package linkedlists;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TotalLong {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productArray(new int [] {12, 13})));

    }

    public static long[] productArray(int[] numbers){
        long total = 1;

        for (var num : numbers) total *= num;

        long [] result = new long [numbers.length];
        for (var i = 0; i< numbers.length; i++){
            result [i] = total / numbers[i];
        }
        return result; // Do your magic!
    }
}
