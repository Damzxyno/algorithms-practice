
public class MergeString {
    public static void main(String[] args) {
        System.out.println(stringMerge("hello", "world", 'l'));
    }

    public static String stringMerge(String s1, String s2, char letter) {
        //write your adorable code here
        int indexS1End = s1.indexOf(letter);
        int indexS2Begin = s2.indexOf(letter);
        return  s1.substring(0, indexS1End) + s2.substring(indexS2Begin);
    }
}
