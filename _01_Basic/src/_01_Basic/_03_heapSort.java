package _01_Basic;

import _01_Basic.tools.Integers;
import _01_Basic.tools.Asserts;
import _01_Basic.tools.Times;

public class _03_heapSort  {
	
	public static int heapSize;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// 
//		Integer[] array = Integers.random(10000, 1, 20000);
		int[] array = {34, 14, 56, 12, 78, 3, 66, 23};
		

		sort(array);
		
		for (int j=0; j<array.length; j++) {
			System.out.print(array[j]);
			System.out.print(" * ");
		}

	}

	public static void sort(int[] array) {
		// 原地建堆
		heapSize = array.length;
		for (int i = (heapSize >> 1) - 1; i >= 0; i--) {
			siftDown(i, array);
		}
		
		while (heapSize > 1) {
			// 交换堆顶元素和尾部元素
			swap(0, --heapSize, array);

			// 对0位置进行siftDown（恢复堆的性质）
			siftDown(0, array);
		}
	}
	
	public static void siftDown(int index, int[] array) {
		Integer element = array[index];
		
		int half = heapSize >> 1;
		while (index < half) { // index必须是非叶子节点
			// 默认是左边跟父节点比
			int childIndex = (index << 1) + 1;
			Integer child = array[childIndex];
			
			int rightIndex = childIndex + 1;
			// 右子节点比左子节点大
			if (rightIndex < heapSize && 
					cmp(array[rightIndex], child) > 0) { 
				child = array[childIndex = rightIndex];
			}
			
			// 大于等于子节点
			if (cmp(element, child) >= 0) break;
			
			array[index] = child;
			index = childIndex;
		}
		array[index] = element;
	}

	public static int cmp(int value1, int value2) {
		return value1 - value2;
	}
	
	public static void swap(int index1, int index2, int[] array) {
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
	}
	
}
