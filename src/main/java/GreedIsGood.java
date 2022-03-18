import java.util.Arrays;

public class GreedIsGood {
    public static void main(String[] args) {
        System.out.println(greedy(new int [] {6, 6, 6, 1, 1}));
    }
    public static int greedy(int[] dice){
        {
            int[] diceCount = {0, 0, 0, 0, 0, 0};

            for (var value : dice) {
                diceCount[value - 1] += 1;
            }

            System.out.println(Arrays.toString(diceCount));
            int result = 0;

            for (int i = 0; i <= dice.length; i++) {
                int current = diceCount[i];
                System.out.println(current);
                int main = current / 3;
                int remainder = current % 3;

                switch (i) {
                    case 0:
                        result += main * 1000;
                        result += remainder * 100;
                        break;
                    case 4:
                        result += remainder * 50;
                    default:
                        result += main * (i + 1) * 100;
                        break;
                }

            }
            //code here
            return result;
        }

    }
}
