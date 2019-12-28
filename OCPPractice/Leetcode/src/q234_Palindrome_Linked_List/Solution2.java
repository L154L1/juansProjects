// Someone's O(N) time, O(1) space solution:

package q234_Palindrome_Linked_List;

public class Solution2 {
	
	public boolean isPalindrome(ListNode head) {
        if ((head == null) || (head.next == null)) {
            return true;
        }
        
        // Count list size
        int size = 0;
        for (ListNode p = head; p != null; p = p.next, size++);
        
        int halfSize  = size / 2;
        int p1Steps   = ((size % 2) == 0) ? halfSize : halfSize + 1;
        int p2Steps   = halfSize - 1;  
        ListNode p1   = head;
        ListNode p2   = head;

        // Position p1 to walk the right half
        for (int j = 0; j < p1Steps; j++, p1 = p1.next);
                
        // Reverse the left half and position p2 to walk it in reverse order
        ListNode temp1 = p2.next;
        p2.next = null;
        for (int j = 0; j < p2Steps; j++) {
            ListNode temp2 = temp1.next;
            temp1.next = p2;
            p2 = temp1;
            temp1 = temp2;
        }
        
        // Walk p1 and p2 until mismatch or end of list
        for (int j = 0; j < halfSize; j++) {
            if (p1.val != p2.val) {
                return false;
            } 
            p1 = p1.next;
            p2 = p2.next;            
        }
                    
        // We could also reverse the left half links back
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
		
		Solution2 s = new Solution2();
		System.out.println(s.isPalindrome(n1));		// true
		
		System.out.println(s.isPalindrome(n2));		// false

	}

}
