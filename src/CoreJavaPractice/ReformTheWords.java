package CoreJavaPractice;


public class ReformTheWords {
    public static String getWord(String left, String right) {
        String word =  left.concat(right).toLowerCase();
        String firstLetter  = word.substring(0,1).toUpperCase();
        String remainLetter = word.substring(1);
        word = firstLetter + remainLetter;
        return word;
    }

    public static void main(String[] args) {
        System.out.println(getWord("Sunil", "Panday"));
    }
}
