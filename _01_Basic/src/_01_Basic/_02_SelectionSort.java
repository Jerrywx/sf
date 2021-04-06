package _01_Basic;

public class _02_SelectionSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {34, 14, 56, 12, 78, 3, 66, 23};
		

		sort1(array);
		
		for (int j=0; j<array.length; j++) {
			System.out.print(array[j]);
			System.out.print(" ");
		}
	}
	
	
	public static void sort1(int[] array) {
		for (int i=array.length - 1; i>0; i--) {
			int maxIndex = 0;
			for (int j=1; j<=i; j++) {
				if (comp(array[j], array[maxIndex]) > 0) {
					maxIndex = j;
				}
			}
			/// 交换
			if (maxIndex != i) {
				swap(maxIndex, i, array);
			}
		}
	}
	
	public static int comp(int value1, int value2) {
		return value1 - value2;
	}
	
	public static void swap(int index1, int index2, int[] array) {
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
	}
	
}
