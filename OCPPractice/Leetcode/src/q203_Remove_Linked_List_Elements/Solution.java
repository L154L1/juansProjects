//203. Remove Linked List Elements

//Remove all elements from a linked list of integers that have value val.

//Example:
//Input:  1->2->6->3->4->5->6, val = 6
//Output: 1->2->3->4->5

// My score:
//Success
//Runtime: 1 ms, faster than 98.81% of Java online submissions for Remove Linked List Elements.
//Memory Usage: 40.1 MB, less than 100.00% of Java online submissions for Remove Linked List Elements.

package q203_Remove_Linked_List_Elements;

public class Solution {
	
	public ListNode removeElements(ListNode head, int val) {
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode curr = dummy, prev = dummy;
		
		while(curr.next != null) {		
			curr = curr.next;
			if(curr.val == val) 
				prev.next = curr.next;
			else prev = curr;
		}
		
		return dummy.next;
        
    }

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(6);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(5);
		ListNode n7 = new ListNode(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		
		Solution s = new Solution();
		
//		System.out.println(s.removeElements(n1, 6).val);
//		System.out.println(s.removeElements(n1, 6).next.val);
//		System.out.println(s.removeElements(n1, 6).next.next.val);
//		System.out.println(s.removeElements(n1, 6).next.next.next.val);
//		System.out.println(s.removeElements(n1, 6).next.next.next.next.val);
		
		
		System.out.println(s.removeElements(n1, 1).val);
		System.out.println(s.removeElements(n1, 1).next.val);
		System.out.println(s.removeElements(n1, 1).next.next.val);
		System.out.println(s.removeElements(n1, 1).next.next.next.val);

	}

}



// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
