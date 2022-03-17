import java.util.ArrayList;
import java.util.List;

public class PascalTrianglePractice {
    public static void main(String[] args) {
        System.out.println(generatePascalTriangle(4));
    }

    public static List<List<Integer>> generatePascalTriangle(int num) {
        List<List<Integer>> solution = new ArrayList<>();
        solution.add(new ArrayList<>(List.of(1)));
        if (num == 1) return solution;

        for (int i = 1; i < num; i++) {
            List<Integer> newPascalRow = new ArrayList<>();
            newPascalRow.add(1);
            int indexOfLastAddedPascalRow = solution.size() - 1;
            var lastAddedPascalRow = solution.get(indexOfLastAddedPascalRow);
            for (int j = 0; j < lastAddedPascalRow.size() - 1; j++) {
                newPascalRow.add(lastAddedPascalRow.get(j) + lastAddedPascalRow.get(j + 1));
            }
            newPascalRow.add(1);
            solution.add(newPascalRow);
        }
        return solution;
    }
}
