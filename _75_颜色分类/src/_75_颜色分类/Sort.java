package _75_颜色分类;

public class Sort {

	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
//		System.out.print(nums); [2,0,2,1,1,0]
		System.out.print("\n");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			System.out.print("," );
		}

	}

	/// https://leetcode-cn.com/problems/sort-colors/
	public static void sortColors(int[] nums) {
			
		int l = 0;
		int r = nums.length - 1;
		int i = r;
		while (i >= l) {
			int value = nums[i];
			if (value == 2) {
				swap(nums, i--, r--);
			} 
			else if (value == 0) {
				swap(nums, i, l++); 
			} else {
				i--;
			}
		}
    }
	
	public static void swap(int[] nums, int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
	
}
