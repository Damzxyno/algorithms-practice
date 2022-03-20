public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0){
            if (columnNumber == 26) result.insert(0, characterize(columnNumber));
            else result.insert(0, characterize(columnNumber% 26));
            columnNumber = ((columnNumber - 1) / 26);
            }
        return result.toString();
    }

    public static String characterize (int num){
        return num == 0 ? "Z" : String.valueOf((char)(num + 64));
    }
}
