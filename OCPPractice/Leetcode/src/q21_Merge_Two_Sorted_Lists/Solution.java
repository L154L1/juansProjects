// 21. Merge Two Sorted Lists

//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

//Example:
//Input: 1->2->4, 1->3->4
//Output: 1->1->2->3->4->4

// My score:
//Success
//Runtime: 2 ms, faster than 22.73% of Java online submissions for Merge Two Sorted Lists.
//Memory Usage: 39.6 MB, less than 16.16% of Java online submissions for Merge Two Sorted Lists.


package q21_Merge_Two_Sorted_Lists;
import java.util.*;

public class Solution {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		List<Integer> list = new ArrayList<>();
		
		ListNode curr1 = l1, curr2 = l2, dummyHead = new ListNode(0), curr = dummyHead;
		
		if(l1 != null) {
			while(curr1.next != null) {
				list.add(curr1.val);
				curr1 = curr1.next;
			}
			list.add(curr1.val);
		}
		
		if(l2 != null) {
			while(curr2.next != null) {
				list.add(curr2.val);
				curr2 = curr2.next;
			}
			list.add(curr2.val);
		}
				
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			curr.next = new ListNode(list.get(i));
			curr = curr.next;
		}
		
        return dummyHead.next;
    }

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		
		ListNode n4 = new ListNode(1);
		ListNode n5 = new ListNode(3);
		ListNode n6 = new ListNode(4);
		n4.next = n5;
		n5.next = n6;
		
		Solution s = new Solution();
		System.out.println(s.mergeTwoLists(n1, n4).val);
		System.out.println(s.mergeTwoLists(n1, n4).next.val);
		

	}

}



// * Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

