package LeetCodePractice.String;

public class FindFirstPalindromicStringInArray {

    public static String firstPalindromicString(String [] words){
        StringBuilder stringBuilder = new StringBuilder();
        for(String word : words){
            stringBuilder.append(word);
            if(stringBuilder.reverse().toString().equals(word)){
                return word;
            }
            stringBuilder.delete(0, stringBuilder.length());
        }
        return "";
    }

    public static void main(String[] args) {
        String [] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindromicString(words));
    }
}
