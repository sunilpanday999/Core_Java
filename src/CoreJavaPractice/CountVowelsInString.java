package CoreJavaPractice;

public class CountVowelsInString {
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] c = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < str.length(); i++) {
            for(int j=0; j< c.length; j++){
                if(str.charAt(i)==c[j]){
                    vowelsCount += 1;
                }
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("The quick brown fox jumps over the lazy dog."));
    }
}
