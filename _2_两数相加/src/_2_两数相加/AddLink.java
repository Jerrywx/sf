package _2_两数相加;


public class AddLink {

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

	/// https://leetcode-cn.com/problems/add-two-numbers/
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		
		int more = 0;
		ListNode newHead = new ListNode(0);
		ListNode lastNode = newHead;
		
		/// 遍历
		while (l1 != null || l2 != null) {
			
			int val1 = 0;
			if (l1 != null) {
				val1 = l1.val;
				l1 = l1.next;
			}
			
			int val2 = 0;
			if (l2 != null) {
				val2 = l2.val;
				l2 = l2.next;
			}
			
			int sum = val1 + val2 + more;
			int value = sum % 10;
			more = sum / 10;
			
			ListNode node = new ListNode(value);
			lastNode.next = node;
			lastNode = node;
		}
		
		if (more > 0) {
			ListNode node = new ListNode(more);
			lastNode.next = node;
			lastNode = node;
		}
		
		lastNode.next = null;

		return newHead.next;
    }

}
