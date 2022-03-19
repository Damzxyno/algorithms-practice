public class FindMissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int []{1, 2, 3}));
    }

    public static int missingNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            result+= i+1;
            result-= nums[i];
        }
        return result;
    }

}
