package sort;

import util.ArrayUtils;

public class ExchangeSort {

    public static void main(String[] args) {
        ExchangeSort es = new ExchangeSort();
        int[] list = { 6, 2, 3, 4, 8, 2, 8, 2, 4, 5 };

        System.out.println("Sources :\t\t" + ArrayUtils.printArray(list));

        es.nonDecreasingSort(list.length, list);
        System.out.println("nonDecreasingSort :\t" + ArrayUtils.printArray(list));

        es.nonIecreasingSort(list.length, list);
        System.out.println("nonIecreasingSort :\t" + ArrayUtils.printArray(list));
    }

    private void nonDecreasingSort(int n, int[] list) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = (i + 1); j < n; j++) {
                if (list[i] > list[j]) {
                    ArrayUtils.exchange(list, i, j);
                }
            }
        }
    }

    private void nonIecreasingSort(int n, int[] list) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = (i + 1); j < n; j++) {
                if (list[i] < list[j]) {
                    ArrayUtils.exchange(list, i, j);
                }
            }
        }
    }
}
