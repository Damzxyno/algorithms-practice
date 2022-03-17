import java.util.Arrays;

public class HCF {
    public static void main(String[] args) {
        System.out.println(findHCF(new int [] {2, 4, 6, 32}));
    }

    public static int findHCF (int [] arrOfNumbers) {
        int potentialHCF = Arrays.stream(arrOfNumbers).reduce(Integer::max).getAsInt();
        boolean foundHCF;

        while (potentialHCF >= 1) {
            foundHCF = true;
            for (int number : arrOfNumbers){
                if (number % potentialHCF != 0) {
                    foundHCF = false;
                    break;
                }
            }
            if (foundHCF) return potentialHCF;
            potentialHCF--;
        }
        return -1;
    }
}
