package stream_practice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersI {
    public static void main(String[] args) {
        numberJoining(new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    public static void numberJoining (int [] num){
        int [] newNum = IntStream.of(num).map(i -> i%2 == 0 ? 2 : 3).toArray();
        System.out.println(Arrays.toString(newNum));
    }

}
