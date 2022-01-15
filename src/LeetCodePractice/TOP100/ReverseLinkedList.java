package LeetCodePractice.TOP100;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if(head == null) return head;

        ListNode currentNode = head;
        ListNode prevNode = null;
        while (currentNode.next != null){
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        currentNode.next = prevNode;
        return currentNode;

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(2, new ListNode(3, new ListNode(4)));
        System.out.println(reverseList(node));
    }
}
