package CoreJavaPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConvienceStoreChange {

    public static boolean changeEnough(int[] change, double amountDue) {
        double total = 0;
        total = change[0]*0.25 + change[1]*0.10 + change[2]*0.05 + change[3]*0.01;
        if(total < amountDue){
            return true;

        }
        return false;

    }
    public static void main(String[] args) {

        int[] change = {2, 100, 0, 0};
        double amountDue = 14.11;

        System.out.println(changeEnough(change, amountDue));
    }
}
