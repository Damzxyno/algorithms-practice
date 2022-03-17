import java.util.Arrays;

public class EqualDivision {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(equalDiv(30, 3)));
    }

    public static int [] equalDiv (final int number, int places){
        int [] solution = new int[places];

        for (int i = 0; i < places; i++){
            solution [i]  = Math.floorDiv(number, places);
            places--;
        }

        return solution;
    }
}
