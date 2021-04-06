package _01_Basic.tools;

public class Asserts {
	public static void test(boolean value) {
		try {
			if (!value) throw new Exception("测试未通过");
		} catch (Exception e) {
			e.printStackTrace();
		}
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
