package _160_相交链表;

public class EqualLink {

	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	/// https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    
		ListNode tmpA = headA;
        ListNode tmpB = headB;

        while (headA != null && headB != null) {
			
			if (headA == headB) {
				return headA;
			}
			if (headA.next == null && headB.next == null) {
				return null;
			} else if (headA.next == null) {
				headA = tmpB;
                headB = headB.next;
                continue;
			} else if (headB.next == null) {
                headA = headA.next;
				headB = tmpA;
                continue;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
    }

}