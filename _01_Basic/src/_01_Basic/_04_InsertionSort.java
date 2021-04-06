package _01_Basic;

import _01_Basic.tools.Asserts;

public class _04_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {34, 14, 56, 12, 78, 112, 3, 66, 23};

		sort2(array);
		
		for (int j=0; j<array.length; j++) {
			System.out.print(array[j]);
			System.out.print(" * ");  
		}
	}

	///
	public static void sort2(int[] array) {
		/// 插入
		for (int i=1; i<array.length; i++) {
			int value = array[i];
			int cur = i;
			while (cur > 0 && array[cur - 1] > value) {
				array[cur] = array[cur - 1];
				cur--;
			}
			array[cur] = value;
		}
	}
	
	///
	public static void sort(int[] array) {
		
		/// 插入
		for (int i=1; i<array.length; i++) {
			
			for (int j=i; j>0;j--) {
				if (Asserts.cmp(array[j], array[j - 1]) < 0) {
					Asserts.swap(j, j - 1, array);
				}
			}
		}
	}
	
}
