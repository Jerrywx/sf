package _16_16_逆序对;

public class 逆序对 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,3,5,7,9,7};
		subSort(nums);

		System.out.print("\n");		
	}
	
	/// https://leetcode-cn.com/problems/sub-sort-lcci/
	public static int[] subSort(int[] array) {
		
		if (array.length == 0) return new int[]{-1, -1};
		
		int begin = -1;
		int end = - 1;
		int max = array[0];
		int min = array[array.length - 1];
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {	
				max = array[i];
			} else {
				begin = i;
			}
		}
		
//		if( begin == 0 ) return new int[]{-1, -1};

		for (int i = array.length - 1; i >=0; i--) {
			if (array[i] <= min) {
				min = array[i];
			} else {
				end = i;
			}
		}
		return new int[]{end, begin};
	}

}
