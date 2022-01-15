package LeetCodePractice.TOP100;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        if (haystack.equals(needle)) return 0;
        int needleLength = needle.length();
        for (int i=0; i<haystack.length() - needleLength; i++){
            if (haystack.substring(i, i+needleLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "c";
        ImplementstrStr implementstrStr = new ImplementstrStr();
        System.out.println(implementstrStr.strStr(haystack, needle));
    }
}
