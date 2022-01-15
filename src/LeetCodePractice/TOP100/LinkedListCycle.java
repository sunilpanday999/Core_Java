package LeetCodePractice.TOP100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null){
            if(set.contains(head)){
                return true;
            }
            else{
                set.add(head);
            }
            head = head.next;
        }

        return false;
    }

}
/*
while (head != null) {
        if (nodesSeen.contains(head)) {
        return true;
        } else {
        nodesSeen.add(head);
        }
        head = head.next;
        }
        return false;

 */
