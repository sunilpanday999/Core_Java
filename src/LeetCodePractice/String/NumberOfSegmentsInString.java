package LeetCodePractice.String;

public class NumberOfSegmentsInString {
    public static int countSegments(String s) {
        String trimmed = s.trim();
        if(trimmed.equals("")){
            return 0;
        }
        return trimmed.split("\\s+").length;
    }

    public static void main(String[] args) {
        String s = "    foo    bar";
        System.out.println(countSegments(s));
    }
}
