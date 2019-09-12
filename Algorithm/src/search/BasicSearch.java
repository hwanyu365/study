package search;

import sort.ExchangeSort;
import util.ArrayUtils;

public class BasicSearch {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 6, 8, 2, 4, 5, 12 };
		BasicSearch ss = new BasicSearch();

		int target = 12;
		long duration = System.nanoTime();
		int result = ss.sequentialSearch(array, target);
		duration = System.nanoTime() -duration;
		System.out.format("sequentialSearch:\t%s is located at %s in %s (%s ns)", target, result, ArrayUtils.printArray(array), duration);

		ExchangeSort es = new ExchangeSort();
		es.nonDecreasingSort(array.length, array);
		
		duration = System.nanoTime();
		result = ss.binarySearch(array, target);
		duration = System.nanoTime() - duration;
		System.out.format("\nbinarySearch:\t\t%s is located at %s in %s (%s ns)", target, result, ArrayUtils.printArray(array), duration);
	}

	private int sequentialSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return ++i;
			}
		}
		return 0;
	}

	private int binarySearch(int[] array, int target) {
		int start = 0;
		int end = array.length - 1;
		int mid = 0;

		while (start >= 0 && end >= 0 && start <= end) {
			mid = (end + start) / 2;
			if (array[mid] == target) {
				return ++mid;
			} else if (array[mid] > target) {
				end = --mid;
			} else {
				start = ++mid;
			}
		}
		return 0;
	}
}
