// 206. Reverse a singly linked list.

//Example:
//Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL


package q206_Reverse_Linked_List;

public class Solution {
	
	public ListNode reverseList(ListNode head) {
		
		ListNode prevNode = null;
        ListNode currNode = head;
        while (currNode != null) {
            ListNode temp = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = temp;
        }
        head = prevNode;
        return head;
        
    }

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		Solution s = new Solution();
		System.out.println(s.reverseList(n1).val);

	}

}

//Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}
