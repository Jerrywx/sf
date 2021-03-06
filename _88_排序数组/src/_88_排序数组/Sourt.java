package _88_排序数组;

public class Sourt {
	
	public static void main(String[] args) {
		int[] nums1 = {2, 4, 6, 0, 0, 0};
		int[] nums2 = {5, 7, 8};
		merge(nums1, 3, nums2, 3);
		System.out.print(nums1);
		System.out.print("\n");
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i]);
			System.out.print(",");
		}
	}
	
	/// https://leetcode-cn.com/problems/merge-sorted-array/submissions/
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i1 = m - 1;
		int i2 = n - 1;
		int iCur = nums1.length - 1;
		
		while (i2 >= 0) {
			if (i1 >= 0 && nums1[i1] > nums2[i2]) {
				nums1[iCur--] = nums1[i1--];
			} else {
				nums1[iCur--] = nums2[i2--];
			}
		}
		
	}

}
