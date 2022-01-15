package CoreJavaPractice;

public class ReverseString {
    public static String reverse(String str){
        char [] c = str.toCharArray();
        for(int i=str.length()-1; i>=0; i--){
            str += c[i];

        }
        return str;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverse(str));
    }
}
