import java.util.Arrays;

public class MoveZeroes {
        public static void moveZeroes(int[] nums) {

            for(int i = 1; i < nums.length; i++){
                int j = i - 1;
                while (nums[j] == 0) {
                    swap(nums, j, j + 1);
                    j--;
                    if (j == -1) break;
                }

            }
            System.out.println(Arrays.toString(nums));
        }

        public static void swap (int [] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    public static void main(String[] args) {
//        moveZeroes(new int [] {0,1,0,3,12});
        System.out.println((int) 'a');
        System.out.println((int) 'm');

        System.out.println(printerError("az"));
    }


    public static String printerError(String s) {
        // your code
        int error = 0;
        for (char charac : s.toCharArray())
            if (!((int) charac >= 97) || !((int) charac <= 109)) error++;


        return "" + error + "/" + s.length();

    }
}
