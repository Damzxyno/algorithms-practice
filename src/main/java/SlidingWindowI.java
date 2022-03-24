import java.util.Arrays;

public class SlidingWindowI {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateSubArrayTotal(new int [] {1, 2, 3, 4, 5, 6, 7}, 6)));

        System.out.println( ('1'));
        System.out.println( '1' + '0');
        System.out.println( (1) + '0');
    }


    public static int [] generateSubArrayTotal (int [] arr, int quantity){
        int [] subArrSum = new int [arr.length - quantity + 1];
        int index = 0;
        int current = 0;

        for (int i = 0; i < quantity; i++){
            current+= arr[i];
        }
        subArrSum[index] = current;
        index++;

        for (var i = 1; i < arr.length - quantity + 1; i++){
            current -= arr[i-1];
            current += arr[quantity + i - 1];
            subArrSum[index] = current;
            index++;
        }
        return subArrSum;
    }
}
