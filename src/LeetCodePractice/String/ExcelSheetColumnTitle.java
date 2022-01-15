package LeetCodePractice.String;

public class ExcelSheetColumnTitle {

    public static String convertToTitle(int columnNumber)  {

        if(columnNumber <= 0){
            System.out.println("Invalid Input");
        }
        StringBuilder stringBuilder = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;
            char c = (char) (columnNumber % 26 + 'A');
            columnNumber /= 26;
            stringBuilder.append(c);
        }
        stringBuilder.reverse();
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(convertToTitle(n));
    }
}
