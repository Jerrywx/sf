package _203_移除链表元素;



public class Linker {

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
	
	/// https://leetcode-cn.com/problems/remove-linked-list-elements/
	public ListNode removeElements(ListNode head, int val) {
		
		ListNode newHead = new ListNode(0);
		ListNode curNode = newHead;
		newHead.next = head;
		
		while (curNode.next != null) {
			
			if (curNode.next != null && curNode.next.val == val) {
				curNode.next = curNode.next.next;
			} else {
				curNode = curNode.next;
			}	
		}
		return newHead.next;
    }
	
	public ListNode removeElements2(ListNode head, int val) {
		
		ListNode newHead = new ListNode(0);
		ListNode curNode = newHead;
		
		while (head != null) {
			if (head.val != val) {
				curNode.next = head;
				curNode = head;
			}
			head = head.next;
		}
		curNode.next = null;
		return newHead.next;
    }
	
}
