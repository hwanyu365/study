package sort;

import util.ArrayUtils;

public class Sort {
	public static void main(String[] args) {
		int[] list = { 2, 467, 6, 333, 45, 73, 45, 388, 45, 689, 34, 645, 234, 23,2, 23, 9, 789, 25, 88, 99, 25, 777, 345, 345, 6, 9, 123, 3478, 5, 2356, 31, 87, 234 };

		ExchangeSort es = new ExchangeSort();
        System.out.format("Sources\n%s", ArrayUtils.printArray(list));

        int[] src = list;        
        long duration = System.nanoTime() / 1000;
        es.nonIecreasingSort(src.length, src);
        duration = System.nanoTime() / 1000 - duration;
        System.out.format("\n\nnonIecreasingSort (%s§Á)\n%s", duration, ArrayUtils.printArray(src));
        
        src = list;        
        duration = System.nanoTime() / 1000;
        es.nonDecreasingSort(src.length, src);
        duration = System.nanoTime() / 1000 - duration;
        System.out.format("\n\nnonDecreasingSort (%s§Á)\n%s", duration, ArrayUtils.printArray(src));
		
        MergeSort ms = new MergeSort();
        src = list;        
        duration = System.nanoTime() / 1000;
		ms.mergeSort(src, 0, (src.length - 1));
		duration = System.nanoTime() / 1000 - duration;
		System.out.format("\n\nMergeSort (%s§Á)\n%s", duration, ArrayUtils.printArray(src));

		QuickSort qs = new QuickSort();
		src = list;
		duration = System.nanoTime() / 1000;
		qs.quickSort(src, 0, (src.length - 1));
		duration = System.nanoTime() / 1000 - duration;
		System.out.format("\n\nQuickSort (%s§Á)\n%s", duration, ArrayUtils.printArray(src));

		src = list;
		es.nonDecreasingSort(src.length, src);
		duration = System.nanoTime() / 1000;
		qs.quickSort(src, 0, (src.length - 1));
		duration = System.nanoTime() / 1000 - duration;
		System.out.format("\n\nQuickSort (%s§Á)\n%s", duration, ArrayUtils.printArray(src));
	}
}
