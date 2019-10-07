# Algorithm?
�˰����̶� ������ ���� ���� ã�� �ܰ����� ����

# ���⵵ �м�
���������� ����Ǵ� Ƚ���� �Է��� ũ�⿡ ���� �Լ��� ���Ͽ� �˰����� ȿ������ �м��Ѵ�.

## �ð����⵵ �м�
�Է�ũ���� ���� ���ؼ� ���������� �� �� �����ϴ����� ���ϴ� ��

### ��� ��� �ð����⵵ (Every-case Time Complexity)
�Է� ���� ������� �׻� ���������� Ƚ���� ���� ��, T(n)�� �Է�ũ�� n�� ���Ͽ� �˰����� ������ ���������� ���� Ƚ���� �����Ѵ�.
�� �� T(n) �� �˰����� ��� ��� �ð� ���⵵��� �ϸ�, T(n)�� ���ϴ� ������ ��� ��� �ð� ���⵵ �м��̶�� �Ѵ�.

������ ��κ��� �˰����� ��� ��� �ð����⵵�� ���� �ʱ� ������ �Ʒ��� 3���� �ٸ� �м� ����� ����Ѵ�.
��� ��� �ð����⵵�� ���� �Ұ����� �˰����̶�� �־��̳� ����� �ð� ���⵵ �м��� ����Ѵ�.
* �־��� ��� �ð����⵵ (Worst-case Time Complexity)
* ����� ��� �ð����⵵ (Average-case Time Complexity)
* �ּ��� ��� �ð����⵵ (Best-case Time Complexity)

### �־��� ��� �ð����⵵
�˰����� ������ ���������� �ִ� Ƚ���� ����ϴ� �������, W(n)�� �Է�ũ�� n�� ���Ͽ� �˰����� ������ ���������� �ִ� Ƚ���� �����Ѵ�.

### ����� ��� �ð����⵵
�˰����� ������ ���������� ��� ���� Ƚ���� ����ϴ� �������, A(n)�� �Է�ũ�� n�� ���Ͽ� �˰����� ������ ���������� ��� Ƚ���� �����Ѵ�.
A(n)�� ����ϱ� ���ؼ� ũ�Ⱑ n�� �Է¿� ���� Ȯ���� �ο��Ͽ� ����Ѵ�.

### �ּ��� ��� �ð����⵵
�˰����� ������ ���������� �ּ� ���� Ƚ���� ����ϴ� �������, B(n)�� �Է�ũ�� n�� ���Ͽ� �˰����� ������ ���������� �ּ� Ƚ���� �����Ѵ�.

## Big O
```
�־��� ���⵵ �Լ� f(n)�� ���ؼ�, O(f(n)) �� n �� N �� �����ϴ� ��� n�� ���� ���� �ε���� �����ϴ� ���� �Ǽ� c�� ���� �ƴ� ���� N�� �����ϴ� ���⵵ �Լ� g(n)�� �����̴�. (g(n) �� O(f(n)))
    g(n) �� c x f(n)
```
���� g(n) �� O(f(n)) �̸�, "g(n)�� f(n)�� Big O �̴�" ��� �Ѵ�. g(n)�� �ñ������� �ּ��� f(n)�� x���Լ���ŭ�� ���ٶ�� ���� �� �ִ�.
Big O�� �Լ��� �ñ����� ���¸� ����ϱ� ������ �Լ��� �������� (asymptotic) ���¸� ��Ÿ���ٰ� ���Ѵ�. "Big O"�� �Լ��� �������� ���� (asymptotic upper bound)�� �شٶ�� �Ѵ�.

## �� (���ް�)
```
�־��� ���⵵ �Լ� f(n) �� ���ؼ�, ��(f(n))�� n �� N �� �����ϴ� ��� n�� ���� �������� �����ϴ� ���� �Ǽ� c�� ���� �ƴ� ���� N�� �����ϴ� ���⵵ �Լ� g(n) �� �����̴�. (g(n) �� �� (f(n)))
    g(n) �� c x f(n)
```
���� g(n) �� �� (f(n)) �̸�, "g(n)�� f(n)�� ���̴�" ��� �Ѵ�. g(n)�� �ñ������� �ּ��� f(n)�� x���Լ���ŭ�� ���ڴٶ�� ���� �� �ִ�.

## ������ ����
1. g(n) �� O(f(n)) if and only if f(n) �� �� (g(n))
2. g(n) �� ��(f(n)) if and only if f(n) �� �� (g(n))
3. b >1 �̰� a > 1 �̸�, ������ �����Ѵ�.<br>
    log<sub>a</sub>n �� ��(log<sub>b</sub>n)<br>
�̴� ��� ������⵵ �Լ��� ���� ���⵵ ī�װ��� ������ �Ͻ��Ѵ�. �� ī�װ��� ��(log<sub>2</sub>n)���� ǥ���Ѵ�.
4. b > a > 0 �̸�, ������ �����Ѵ�.<br>
    a<sup>n</sup> �� o(b<sup>n</sup>)<br>
�̴� ��� �������⵵ �Լ��� ���� ���⵵ ī�װ��� ������ ������ �Ͻ��Ѵ�.
5. a > 0 �� ��� a�� ���ؼ�, ������ �����Ѵ�.<br>
    a<sup>n</sup> �� o(n!)<br>
�̴� n!�� � �������⵵ �Լ����� ���ڴٴ� ���� �Ͻ��Ѵ�.
6. ���⵵ ī�װ����� ���� ������ ������ �� �ִ�.<br>
    ��(log<sub>2</sub>n)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;��(n)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;��(nlog<sub>2</sub>n)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;��(n<sup>2</sup>)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;��(n<sup>j</sup>)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;��(n<sup>k</sup>)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;��(a<sup>n</sup>)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;��(b<sup>n</sup>)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;��(n!)<br>
���⼭ k > j > 2�̰�, b > a > 1 �̴�. ���⵵ �Լ� g(n)�� f(n)�� ������ ī�װ��� ���ʿ� ��ġ�Ѵٰ� �ϸ�, ������ �����Ѵ�.<br>
    g(n) �� o(f(n))
7. c �� 0, d �� 0, g(n) �� O(f(n)), h(n) �� ��(f(n))�̸�, ������ �����Ѵ�.
    c * g(n) + d * h(n) �� ��(f(n))

# �˰��� ���� ���
## ���������� (divide-and-conquer)
����� (top-down) ���� �������, �ش��� ���� �� ���� ��ŭ ���� ������ ��ʸ� 2�� �̻��� ���� ��ʷ� ������ ����̴�.
�������� ���������� ������ ���� ������ �̷������.
1. ���� ��ʸ� �ϳ� �̻��� ���� ��ʷ� <b>�����Ѵ�.</b>
2. ���� ��ʵ��� ���� <b>�����Ѵ�(Ǭ��).</b> ���� ��ʰ� ����� ���� ���� �̻� ��͸� ����Ѵ�.
3. �ʿ��ϴٸ�, ���� ��ʿ� ���� �ش��� <b>����(combine)</b>�Ͽ� ���� ����� �ش��� ���Ѵ�.

<br>�������������� �Ʒ��� ���� �˰����� �����Ѵ�.
* �̺а˻� (Binary Search)
* �պ����� (Merge Sort)
* �������� (Quick Sort)


## ������ȹ�� (dynamic programming)
����� (bottom-up) ���� �������, ���� ��ʸ� ���� �ذ��ϰ�, �� ����� ������ ���� �Ŀ� �� ����� �ʿ��� ������ �ٽ� ����ϴ� ��� �� ������ ����� �̿��ϴ� ����̴�.
�Ǻ���ġ ������ ���ϴ� �˰��򿡼� �ݺ��� ������� ������ ���� �ٷ� ������ȹ���� �ش��Ѵ�.

# Algorithm : Search 
## ���� �˻� (Sequential Search)
* Problem : n ���� ���� ������ �迭 S���� � �� x�� ��ġ�� ���϶�.
* Input : n�� ���� ����, S�� n���� ���� ������ ������ �迭, x�� ���� ����
* Output : S �ȿ� x�� ��ġ, ���� S�� x�� ���ٸ� 0
* Pseudo code
    ```java
    private int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return ++i;
            }
        }
        return 0;
    }
    ```
* �ð����⵵
  * �־��� ��� : (n) �� �� = �� (n)

## �̺� �˻� (Binary Search)
* Problem : n ���� ���� ������ �迭 S���� � �� x�� ��ġ�� ���϶�.
* Input : n�� ���� ����, S�� n���� ���� ������ ���ĵ� �迭, x�� ���� ����
* Output : S �ȿ� x�� ��ġ, ���� S�� x�� ���ٸ� 0
* Pseudo code
    ```java
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
    ```
* �ð����⵵
  * �־��� ��� : (log<sub>2</sub>n + 1) �� �� = �� (log<sub>2</sub>n)

## ���� �����˻� Ʈ��
### [Tree & Binary tree](https://ratsgo.github.io/data%20structure&algorithm/2017/10/21/tree/)

## BFS vs DFS
* [���� �켱 Ž��(DFS) �� �ʺ� �켱 Ž��(BFS)](https://yunyoung1819.tistory.com/86)
* [[�׷���] DFS�� BFS �����ϱ�](https://mygumi.tistory.com/102)

# Algorithm : Sort
## ��ȯ���� (exchange sort)
* Problem : n ���� ���� ������ �迭 S�� �񳻸�/�ø��������� �����϶�
* Input : n�� ���� ����, S�� n���� ���� ������ ������ �迭
* Output : �񳻸�/�ø��������� ���ĵ� �迭
* Pseudo code
    ```java
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
    ```
* �ð����⵵ (��� ��� �ð� ���⵵)
<br>    T(n) = (n-1) + (n-2) + (n-3) + ... + 1
<br>           = n(n-1)/2
<br>          �� ��(n<sup>2</sup>)

## �պ����� (merge sort)
* Pseudo code
    ```java
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
        int pivot1 = start;
        int pivot2 = mid + 1;

        for (int i = 0; i < temp.length; i++) {
            if (pivot1 > mid) {
                temp[i] = list[pivot2];
                pivot2++;
            } else if (pivot2 > end) {
                temp[i] = list[pivot1];
                pivot1++;
            } else if (list[pivot1] < list[pivot2]) {
                temp[i] = list[pivot1];
                pivot1++;
            } else {
                temp[i] = list[pivot2];
                pivot2++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            list[start + i] = temp[i];
        }
    }
    ```

* �ð� ���⵵ (�־��� ��� �ð� ���⵵)
<br>    W(start, end) = end - start
<br>    W(n) = W(2/n) + W(2/n) + end - start + 1
<br>            = 2W(2/n) + n;
<br>            = nlog<sub>2</sub>n + n �� �� (nlog<sub>2</sub>n)

    ## ���� ���� (Quick Sort)
* Pseudo code
    ```java
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
    ```

* �ð� ���⵵ (�־��� ��� �ð� ���⵵)
<br>���� ���Ŀ��� �־��� ���� �񳻸��������� ���ĵ� �迭�� �����ϴ� ��쿡 ���� ���� �ɸ���.
�� �� ���ҿ� �ʿ��� �ð����⵵ T(n) = n -1 �̴�. ����,
<br>    W(n) = ���� �κй迭 �����ϴ� �� �ɸ��� �ð� + ������ �κй迭 �����ϴµ� �ɸ��� �ð� + �����ϴµ� �ɸ��� �ð�
<br>           = W(0) + W(n-1) + n - 1
<br>           = W(n-1) + n -1 (W(0) = 0)
<br>           = n(n-1) / 2
<br>           �� ��(n<sup>2</sup>)
<br><br>���� ������ �־��� ��� �ð� ���⵵�� ��ȯ ���ĺ��ٵ� ������ �ʴ�. �׷����� ���� �����̶�� �θ��� ������ ����� ��� �ð����⵵ �����̴�.
* �ð� ���⵵ (����� ��� �ð� ���⵵)
<br>    A(n) = (n+1)2log<sub>2</sub>n
<br>           = (n+1)2(log<sub>2</sub>2)(log<sub>2</sub>n)
<br>           �� 1.38(n+1)log<sub>2</sub>n
<br>           �� ��(log<sub>2</sub>n)

# Algorithm : Etc
## ��İ��� (Matrix Product)
* Problem : m x n, n x p �� ������ �� ����� ���� ���϶�
* Input : m, n, p�� ���� ����
* Output : m x p ��� c �� ���
* Pseudo code
    ```java
    private void product(int[][] a, int[][] b, int[][] c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
    ```

## �Ǻ���ġ ���� (Fibonacci Sequence)
    �Ǻ���ġ ���� ����
    f(0) = 0
    f(1) = 1
    f(n) = f(n-1) + f(n-2)

* Problem : �Ǻ���ġ �������� n��° ���� �����϶�
* Input : n�� ���� �ƴ� ����
* Output : n��° ��
* Pseudo code (����� ��� �� ����������)
    ```java
    private int getFib(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            return getFib(x - 1) + getFib(x - 2);
        }
    }
    ```
* Pseudo code (�ݺ��� ���)
    ```java
    private long getFib(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            long pp = 0;
            long p = 1;
            long result = 0;

            for (int i = 2; i <= x; i++) {
                result = pp + p;
                pp = p;
                p = result;
            }
            return result;
        }
    }
    ```