class BuddyPairs {
    public static void main(String[] args) {
        System.out.println(buddy(1071625, 1103735));  //-- testing(1071625, 1103735, "(1081184 1331967)");
        System.out.println(buddy(2382, 3679));  //-- testing(2382, 3679, "Nothing");
        System.out.println(buddy(381, 4318));  //-- testing(381, 4318, "(1050 1925)");
    }


    public static String buddy(long start, long limit) {
        // your code
        for (long n = start; n <= limit; n++){
            long m = divSum(n);
            if (m > n && n == divSum(m))
                return "(" + n + " " + m +")";
        }
        return "Nothing";
    }

    private static long divSum(long num){
        long sum = 0;
        for (long i = 2; i <= (long) Math.sqrt(num); i++){
            if (num % i == 0) {
                sum+= i;
                long compliment = num / i;
                if (compliment != num) sum += compliment;
            }
        }
        return sum;
    }
}