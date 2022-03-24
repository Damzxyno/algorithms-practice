import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args) {
        System.out.println(minimumDifference(new int [] {9,4, 1, 7}, 3));
    }
        public static int minimumDifference(int[] nums, int k) {
            if (nums.length == 1){
                return 0;
            }
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            int diff = Integer.MAX_VALUE;
            for (int i = k-1; i < nums.length; i++){
                System.out.println(i + " " + (i - k + 1));
                diff = Math.min(diff, nums[i] - nums[i-k+1]);
                System.out.println(diff);
            }
            return  diff;
        }
}
