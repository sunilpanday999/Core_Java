package CoreJavaPractice;

public class StringWordCount {
    public static int wordsCount(String str){
        if(str == null || str.isEmpty()){
            return 0;
        }
        String [] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(wordsCount(s));
    }
}
