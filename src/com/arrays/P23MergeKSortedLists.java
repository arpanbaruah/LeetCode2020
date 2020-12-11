package com.arrays;

import java.util.List;
import java.util.PriorityQueue;

public class P23MergeKSortedLists {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode head = new ListNode(0);
        ListNode curr = head;

        if(lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((n1, n2) -> n1.val-n2.val);

        for(ListNode node : lists){
            if(node != null) pq.add(node);
        }

        while(!pq.isEmpty()){

            ListNode node = pq.poll();
            curr.next = new ListNode(node.val);
            curr = curr.next;

            if(node.next != null) pq.add(node.next);

        }

        return head.next;

    }
}
