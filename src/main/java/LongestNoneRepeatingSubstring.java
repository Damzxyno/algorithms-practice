public class LongestNoneRepeatingSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bwf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int longestLength = 0;

        for(int i = 0; i < s.length(); i++){
            for (int j = i+1; j <= s.length(); j++){
                String subStringS = s.substring(i, j);
                if(containsRepeatingCharacters(subStringS)) break;
                if (subStringS.length() > longestLength)
                        longestLength = subStringS.length();
            }

        }
        return longestLength;
    }


    public static boolean containsRepeatingCharacters(String word){
        for (int i = 0; i < word.length() - 1; i++)
            for (int j = i+1; j < word.length(); j ++)
                if (word.charAt(i) == word.charAt(j)) return true;
        return false;

    }
}
