package LeetCodePractice.TOP100;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {
    public static ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        ListNode1 head = new ListNode1(0);
        ListNode1 p=head;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                p.next = list1;
                list1 = list1.next;
            }else{
                p.next = list2;
                list2 = list2.next;
            }
            p=p.next;
        }

        if(list1!=null){
            p.next = list1;
        }

        if(list2!=null){
            p.next = list2;
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode1 node1 = new ListNode1(2);
        ListNode1 node2 = new ListNode1(3);
        System.out.println(mergeTwoLists(node1, node2));

    }
}
//Definition for singly-linked list.
class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int val) { this.val = val; }
    ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
 }

