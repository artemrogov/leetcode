package org.artemrogov.reverseLinkedList;


import java.util.ArrayList;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}

class SolutionDisplayTestCaseUtil{
    public static List<Integer> convertToArrayList(ListNode node){
        List<Integer> resultArrList = new ArrayList<>();
        while(node!=null){
            resultArrList.add(node.val);
            node = node.next;
        }
        return resultArrList;
    }
    public static void show(ListNode node){
        ListNode resultReverse = Solution.reverseList(node);
        System.out.println(convertToArrayList(resultReverse));
    }
}
//Given the head of a singly linked list, reverse the list, and return the reversed list.
public class ReverseLinkedListMain {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        SolutionDisplayTestCaseUtil.show(node);
    }
}
