import java.util.Arrays;

public class SortedTwoSumSearch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int indexX = 0;
        int indexY = numbers.length - 1;
        int [] result = {1, 1};

        while (indexX < indexY){
            if (numbers [indexX] + numbers[indexY] == target) {
                result[0] += indexX;
                result[1] += indexY;
                break;
            } else if (numbers [indexX] + numbers[indexY] > target){
                indexY--;
            } else indexX++;
        }
        return result;
    }
}
