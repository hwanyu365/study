package sort;

public class MergeSort {
	void mergeSort(int[] list, int start, int end) {
		if (start < end) {
			int mid = (end + start) / 2;
			mergeSort(list, start, mid);
			mergeSort(list, (mid + 1), end);
			merge(list, start, mid, end);
		}
	}

	void merge(int[] list, int start, int mid, int end) {
		int[] temp = new int[end - start + 1];
		int p1 = start;
		int p2 = mid + 1;

		for (int i = 0; i < temp.length; i++) {
			if (p1 > mid) {
				temp[i] = list[p2];
				p2++;
			} else if (p2 > end) {
				temp[i] = list[p1];
				p1++;
			} else if (list[p1] < list[p2]) {
				temp[i] = list[p1];
				p1++;
			} else {
				temp[i] = list[p2];
				p2++;
			}
		}

		for (int i = 0; i < temp.length; i++) {
			list[start + i] = temp[i];
		}
	}
}
