public class DoubleIntegerReversal {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(121));
    }
        public static boolean isSameAfterReversals(final int num) {
            int numCopy = num;
            int firstReverse = reverse(numCopy);
            int secondReverse = reverse(firstReverse);
            return numCopy == secondReverse;
        }


        public static int reverse (final int num){
            int numCopy = num;
            int result = 0;
            while (numCopy != 0){
                result = (result * 10) + numCopy % 10;
                numCopy /= 10;
            }
            return result;
        }
}
