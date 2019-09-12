package sort;

import util.ArrayUtils;

public class QuickSort {
	void quickSort(int[] list, int low, int high) {
		if (low < high) {
			int pivot = partition(list, low, high);
			quickSort(list, low, (pivot - 1));
			quickSort(list, (pivot + 1), high);
		}
	}

	private int partition(int[] list, int low, int high) {
		int pv = list[low];
		int j = low;
		for (int i = (low + 1); i <= high; i++) {
			if (list[i] < pv) {
				j++;
				ArrayUtils.exchange(list, i, j);
			}
		}
		ArrayUtils.exchange(list, low, j);
		return j;
	}
}
