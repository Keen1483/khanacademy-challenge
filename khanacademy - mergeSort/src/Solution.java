
public class Solution {

	public static void main(String[] args) {
		int[] array = {14, 7, 3, 12, 9, 11, 6, 2};
		mergeSort(array, 0, array.length-1);
		for (int n : array) {
			System.out.print(n + " ");
		}
	}
	
	public static void mergeSort(int[] array, int p, int r) {
		if (p < r) {
			int q = (int) Math.floor((p+r) / 2);
			mergeSort(array, p, q);
			mergeSort(array, q+1, r);
			merge(array, p, q, r);
		}
	}
	
	public static void merge(int[] array, int p, int q, int r) {
		int[] lowHalf = new int[q-p+1];
		int[] highHalf = new int[r-q];
		
		int k = p;
		int i;
		int j;
		for (i = 0; k <= q; i++, k++) {
			lowHalf[i] = array[k];
		}
		for (j = 0; k <= r; j++, k++) {
			highHalf[j] = array[k];
		}
		
		k = p;
		i = 0;
		j = 0;
		while (i < lowHalf.length && j < highHalf.length) {
			if (lowHalf[i] < highHalf[j]) {
				array[k] = lowHalf[i];
				i++;
			} else {
				array[k] = highHalf[j];
				j++;
			}
			k++;
		}
		while (i < lowHalf.length) {
			array[k] = lowHalf[i];
			i++;
			k++;
		}
		while (j < highHalf.length) {
			array[k] = highHalf[j];
			j++;
			k++;
		}
	}

}
