import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int [][] arrayTest = new int[4][];
        for(var i = 0; i < arrayTest.length; i++) {
            int [] current = new int [i+1];
                for (int j = 0; j < current.length; j++){
                    current[j] = i + j;
                }
            arrayTest[i] = current;
        }
        System.out.println(Arrays.deepToString(arrayTest));
    }
}
