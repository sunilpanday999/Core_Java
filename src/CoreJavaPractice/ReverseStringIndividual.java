package CoreJavaPractice;

public class ReverseStringIndividual {
    public static void main(String[] args) {
        String input = "Hello Marry how are you?";
        System.out.println(reverseString(input));
    }

    public static String reverseString(String str){
        String reverseNewString= "";
        String [] arr = str.split("//s");
        for (String a : arr){
            StringBuilder stringBuilder = new StringBuilder(a);
            reverseNewString = stringBuilder.reverse().toString();
        }
        return reverseNewString;
    }
}
