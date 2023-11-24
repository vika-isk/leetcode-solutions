package com.angryviking.medium;

/**
 * 2 - Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/description/
 */

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode pResult = result;

        int sum = l1.val + l2.val;
        pResult.val = sum % 10;
        int left = sum / 10;

        while (l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;

            sum = l1.val + l2.val + left;
            left = sum / 10;
            pResult = addToNode(pResult, sum % 10);
        }
        while (l1.next != null) {
            l1 = l1.next;

            sum = l1.val + left;
            left = sum / 10;
            pResult = addToNode(pResult, sum % 10);
        }

        while (l2.next != null) {
            l2 = l2.next;

            sum = l2.val + left;
            left = sum / 10;
            pResult = addToNode(pResult, sum % 10);
        }

        if (left != 0) {
            addToNode(pResult, left);
        }

        return result;
    }

    public ListNode addToNode(ListNode node, int val) {
        node.next = new ListNode();
        node = node.next;
        node.val = val;
        return node;
    }

    public ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode firstNode = new ListNode();
        ListNode pNode = firstNode;
        pNode.val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pNode = addToNode(pNode, arr[i]);
        }
        return firstNode;
    }

    public Boolean areListsEquals(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            if (l1 == null && l2 == null) {
                return true;
            }
            else return false;
        }

        do {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        } while (l1 != null && l2 != null);

        if (l1 != null || l2 != null) {
            return false;
        }

        return true;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
