// 234. Palindrome Linked List

//Given a singly linked list, determine if it is a palindrome.

//Example 1:
//Input: 1->2
//Output: false

//Example 2:
//Input: 1->2->2->1
//Output: true


package q234_Palindrome_Linked_List;

import java.util.*;

public class Solution {
	
	public boolean isPalindrome(ListNode head) {
		
		ListNode l1 = head;
		
		// use stack to store nodes in backward.
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		while(l1 != null) {
			Integer i = l1.val;
			stack.push(i);
			l1 = l1.next;
		}
		
		// create the first node in head2 which is the last node of the input
		ListNode head2 = null;
		if((!stack.isEmpty())) {	
			int i = stack.pop();
			head2 = new ListNode(i);
		}
		
		ListNode l2 = head2;
		
		// add all nodes to head2 from the stack.
		while(!stack.isEmpty()) {
			int i = stack.pop();
			l2.next = new ListNode(i);
			l2 = l2.next;
		}
		
		
		while(head != null && head2 != null) {
			if(head.val != head2.val) return false;
			head = head.next;
			head2 = head2.next;
		}
		
		return true;
        
    }

	

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(1);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		Solution s = new Solution();
		System.out.println(s.isPalindrome(n1));		// true
		
		System.out.println(s.isPalindrome(n2));		// false
		

	}

}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
      ListNode(int x) { val = x; }
}

