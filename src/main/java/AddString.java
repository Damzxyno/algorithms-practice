public class AddString {
    public static void main(String[] args) {
        System.out.println(addTwoString("123", "321"));
        System.out.println(addTwoString("11", "100"));
    }

    public static String addTwoString(String a, String b){
        int maxLength = Math.max(a.length(), b.length());
        String newA = "0".repeat(maxLength - a.length()) + a;
        String newB = "0".repeat(maxLength - b.length()) + b;

        StringBuilder stringBuilder = new StringBuilder();

        int overflow = 0;

       for (int i = maxLength - 1; i >= 0; i--){
           String total = overflow + Integer.parseInt(String.valueOf(newA.charAt(i))) + Integer.parseInt(String.valueOf(newB.charAt(i))) + "";
           overflow = 0;
           stringBuilder.insert(0, total.charAt(total.length()-1));
           if (!(total.substring(0, total.length()-1).isBlank())) overflow = Integer.parseInt(total.substring(0, total.length()-1));
           if (i == 0 && overflow != 0) {
               stringBuilder.insert(0, overflow);
               overflow = 0;
           }
       }



        return stringBuilder.toString();
    }
}
