package _01_Basic;

public class _01_blue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {34, 14, 56, 12, 78, 3, 66, 23};
		
		///
		for (int i=array.length - 1; i>0; i--) {
			
			for (int j=0; j<i; j++) {
				
				if (array[j] > array[j + 1]) {
					int tmp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = tmp;
				}
			}
		}
		
		for (int j=0; j<array.length; j++) {
			System.out.print(array[j]);
			System.out.print(" - ");
		}
	}

}
