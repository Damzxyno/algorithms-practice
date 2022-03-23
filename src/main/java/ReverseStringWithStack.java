import java.util.Stack;

public class ReverseStringWithStack {
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }


    public static String reverse(String word){
        Stack<Character> wordCharacters = new Stack<>();
        String result = "";
        for (char charac : word.toCharArray()) wordCharacters.add(charac);
        while (!wordCharacters.isEmpty()) result+= wordCharacters.pop();

        return result;
    }
}
