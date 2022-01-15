package LeetCodePractice.String;

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {

        if(columnTitle == null) return 0;
        int result = 0;
        for(char c : columnTitle.toCharArray()){
            result = result * 26 + (c - 'A') + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(titleToNumber(s));
    }
}
