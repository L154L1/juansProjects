//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//Example:
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.

package q2_Add_Two_Numbers;

import java.util.LinkedList;

public class Solution {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 	ListNode dummyHead = new ListNode(0);
		    ListNode p = l1, q = l2, curr = dummyHead;
		    int carry = 0;
		    while (p != null || q != null) {
		        int x = (p != null) ? p.val : 0;
		        int y = (q != null) ? q.val : 0;
		        int sum = carry + x + y;
		        carry = sum / 10;
		        curr.next = new ListNode(sum % 10);
		        curr = curr.next;
		        if (p != null) p = p.next;
		        if (q != null) q = q.next;
		    }
		    if (carry > 0) {
		        curr.next = new ListNode(carry);
		    }
		    return dummyHead.next;
    }

	public static void main(String[] args) {
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		
		ListNode n4 = new ListNode(5);
		ListNode n5 = new ListNode(6);
		ListNode n6 = new ListNode(4);
		n4.next = n5;
		n5.next = n6;
		
		Solution s = new Solution();
		ListNode result = s.addTwoNumbers(n1, n4);
		
		ListNode n = result;
		while(n != null) {
			if(n.next != null)
				System.out.print(n.val + " -> ");
			else
				System.out.print(n.val);
			n = n.next;
		}

	}

}
// 7 -> 0 -> 8


class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}
