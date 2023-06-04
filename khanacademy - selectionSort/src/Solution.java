
public class Solution {

	public static void main(String[] args) {
		int[] array = {14, 7, 3, 12, 9, 11, 6, 2};
		selectionSort(array);
		for (int n : array) {
			System.out.print(n + " ");
		}
	}
	
	public static void selectionSort(int[] array) {
		int minValue;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[i]) {
					minValue = array[j];
					array[j] = array[i];
					array[i] = minValue;
				}
			}
		}
	}

}
