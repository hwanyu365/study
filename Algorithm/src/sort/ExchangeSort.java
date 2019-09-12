package sort;

import util.ArrayUtils;

public class ExchangeSort {
    public void nonDecreasingSort(int n, int[] list) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = (i + 1); j < n; j++) {
                if (list[i] > list[j]) {
                    ArrayUtils.exchange(list, i, j);
                }
            }
        }
    }

    public void nonIecreasingSort(int n, int[] list) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = (i + 1); j < n; j++) {
                if (list[i] < list[j]) {
                    ArrayUtils.exchange(list, i, j);
                }
            }
        }
    }
}
