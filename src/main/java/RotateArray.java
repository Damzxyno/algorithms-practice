import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(rotate(new int [] {1, 2, 3, 4, 5, 6,7}, 3)));
                                                           // 4, 5, 6, 7, 1, 2, 3
        System.out.println(Math.ceil(7/2.0));
        rotateD(new int [] {1, 2, 3, 4, 5, 6,7}, 3);
    }

    public static void rotateD (int [] nums, int k) {
        int numsLength = nums.length;
        int indexA = 0;
        int indexB = numsLength - 2 * k;
        int indexC = numsLength - k;


    }


//    public static int [] rotate(int[] nums, int k) {
//        int l = nums.length;
//        int [] solution = new int [l];
//        int index = k;
//        for (int i = 0; i<l; i++){
//            solution [i] = nums[index];
//            index++;
//            if (index == l) index = 0;
//        }
//        return solution;
//    }
}
