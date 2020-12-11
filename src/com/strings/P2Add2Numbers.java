package com.strings;

public class P2Add2Numbers {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(0);
        ListNode curr = node;
        int total = 0, rem = 0;

        while(l1 != null && l2 != null) {

            total = l1.val + l2.val + rem;

            curr.next = new ListNode(total % 10);
            rem = total / 10;

            l1 = l1.next;
            l2 = l2.next;
            curr = curr.next;
        }


        while(l1 != null){

            total = l1.val + rem;
            curr.next = new ListNode(total % 10);
            rem = total / 10;

            l1 = l1.next;
            curr = curr.next;


        }

        while(l2 != null){

            total = l2.val + rem;
            curr.next = new ListNode(total % 10);
            rem = total / 10;

            l2 = l2.next;
            curr = curr.next;


        }

        if(rem > 0){
            curr.next = new ListNode(rem);
            curr = curr.next;
        }

        return node.next;
    }
}
