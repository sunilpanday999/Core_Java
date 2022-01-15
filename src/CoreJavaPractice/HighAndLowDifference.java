package CoreJavaPractice;

public class HighAndLowDifference {

    public static int programmers(int one, int two, int three) {
        int diff = 0;
        if (one > two && one > three || one < two && one < three && two > one && two > three || two < one && two < three)
            diff = one - two;
        else if (two > one && two > three || two < one && two < three && three > one && three > one || three < one && three < two)
            diff = two - three;
        else if (three > one && three > one || three < one && one > two && one > three || one < two && one < three)
            diff = three - one;

        return diff;
    }

    public static void main(String[] args) {
        System.out.println(programmers(16, 4, 6));
    }
}
