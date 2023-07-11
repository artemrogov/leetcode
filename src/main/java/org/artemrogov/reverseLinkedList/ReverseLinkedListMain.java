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

class ItemList {

    private ListNode first;

    public ItemList() {
        this.first = null;
    }

    public void addMultiple(int ...vars){
        for (int i = 0; i<vars.length; i++){
            insertFirstItem(i);
        }
    }
    public void insertFirstItem(int value){
        ListNode nLink = new ListNode(value);
        nLink.next = first;
        first = nLink;
    }

    public List<Integer> toArrayList(){
        ListNode currentNode = first;
        List<Integer> data = new ArrayList<>();
        while (currentNode!=null){
            data.add(currentNode.val);
            currentNode = currentNode.next;
        }
        return data;
    }
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


        ItemList itemList = new ItemList();
        itemList.insertFirstItem(1);
        itemList.insertFirstItem(2);
        itemList.insertFirstItem(3);
        itemList.insertFirstItem(4);
        itemList.insertFirstItem(5);
        System.out.println(itemList.toArrayList());
        System.out.println("multiple values: ");
        ItemList multipleValues = new ItemList();
        multipleValues.addMultiple(1,3,4,5,6,7,8);
        System.out.println(multipleValues.toArrayList());
    }
}
