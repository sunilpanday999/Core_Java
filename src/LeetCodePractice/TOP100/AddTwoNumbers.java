package LeetCodePractice.TOP100;

public class AddTwoNumbers {
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummyHead = new ListNode(0);
//        int carry = 0;
//        while (l1 != null || l2 != null) {
//            int x = (l1 != null) ? l1.val : 0;
//            int y = (l2 != null) ? l2.val : 0;
//            int sum = carry + x + y;
//            carry = sum / 10;
//            dummyHead.next = new ListNode(sum % 10);
//            dummyHead = dummyHead.next;
//            if (l1 != null) l1 = l1.next;
//            if (l2 != null) l2 = l2.next;
//        }
//        if (carry > 0) {
//            dummyHead.next = new ListNode(carry);
//        }
//        return dummyHead.next;
//    }
//
//    public static void main(String[] args) {
//        ListNode l1 = null;
//        ListNode l2 = null;
//        l1 = {2, 4, 3};
//
//        System.out.println(addTwoNumbers(l1, l2));
//    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

