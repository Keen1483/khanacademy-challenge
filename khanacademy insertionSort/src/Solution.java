
public class Solution {

	public static void main(String[] args) {
		int[] array = {14, 7, 3, 12, 9, 11, 6, 2};
		insertionSort(array);
		for (int n : array) {
			System.out.print(n + " ");
		}
	}
	
	public static void insertionSort(int[] array) {
		int j, value;
		for (int i = 0; i < array.length-1; i++) {
			value = array[i+1];
			for (j = i; j >= 0 && array[j] > value; j--) {
				array[j+1] = array[j];
			}
			array[j+1] = value;
		}
	}

}
