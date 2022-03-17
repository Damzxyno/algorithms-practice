import java.util.Arrays;

public class LCM {
    public static void main(String[] args) {
        System.out.println(generateLCM(new int [] {2, 4, 6}));
    }

    public static int generateLCM (int [] arrOfNum){
        int potentialLCM = Arrays.stream(arrOfNum).reduce(Integer::min).getAsInt();
        boolean foundPotentialLCM;

        while (true){
            foundPotentialLCM = true;
            for(int number : arrOfNum){
                if (potentialLCM%number != 0) {
                    foundPotentialLCM = false;
                    break;
                }
            }

            if (foundPotentialLCM) return potentialLCM;
            potentialLCM++;
        }
    }
}
