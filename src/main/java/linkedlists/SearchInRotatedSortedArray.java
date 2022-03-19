//package linkedlists;
//
//public class SearchInRotatedSortedArray {
//    public static void main(String[] args) {
//        System.out.println(search(new int [] {4, 5, 6, 7, 0, 1, 2}, 5));
//
//    }
//    public static int search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//
//        while (left< right){
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) return mid;
//
//            if (nums[mid] > nums[right]) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//
//
//    }
//
//}
