package org.artemrogov.linkedlist;


import org.artemrogov.data_structure.ListNode;

class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode head;
        ListNode temp;

        if (list1.getVal() < list2.getVal()) {
            temp = head = new ListNode(list1.getVal());
            list1 = list1.getNext();
        } else {
            temp = head = new ListNode(list2.getVal());
            list2 = list2.getNext();
        }

        while (list1 != null && list2 != null) {
            if (list1.getVal() < list2.getVal()) {
                temp.setNext(new ListNode(list1.getVal()));
                list1 = list1.getNext();
            } else {
                temp.setNext(new ListNode(list2.getVal()));
                list2 = list2.getNext();
            }
            temp = temp.getNext();
        }

        while (list1 != null) {
            temp.setNext(new ListNode(list1.getVal()));
            list1 = list1.getNext();
            temp = temp.getNext();
        }

        while (list2 != null) {
            temp.setNext(new ListNode(list2.getVal()));
            list2 = list2.getNext();
            temp = temp.getNext();
        }

        return head;
    }
}

public class MergeTwoList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.setNext(new ListNode(2));
        node.getNext().setNext(new ListNode(4));

        ListNode node1 = new ListNode(1);
        node1.setNext(new ListNode(3));
        node1.getNext().setNext(new ListNode(4));

        ListNode aListResult = Solution.mergeTwoLists(node, node1);

        while (aListResult != null) {
            System.out.print(aListResult.getVal() + ",");
            aListResult = aListResult.getNext();
        }
    }
}
