# Algorithm?
알고리즘이란 문제에 대한 답을 찾는 단계적인 절차

# 복잡도 분석
단위연산이 수행되는 횟수를 입력의 크기에 대해 함수로 구하여 알고리즘의 효율성을 분석한다.

## 시간복잡도 분석
입력크기의 값에 대해서 단위연산이 몇 번 수행하는지를 구하는 것

### 모든 경우 시간복잡도 (Every-case Time Complexity)
입력 값에 상관없이 항상 단위연산의 횟수가 같을 때, T(n)은 입력크기 n에 대하여 알고리즘이 수행할 단위연산의 수행 횟수로 정의한다.
이 때 T(n) 을 알고리즘의 모든 경우 시간 복잡도라고 하며, T(n)을 구하는 과정을 모든 경우 시간 복잡도 분석이라고 한다.

하지만 대부분의 알고리즘은 모든 경우 시간복잡도를 갖지 않기 때문에 아래의 3가지 다른 분석 방법을 사용한다.
모든 경우 시간복잡도가 적용 불가능한 알고리즘이라면 최악이나 평균의 시간 복잡도 분석을 사용한다.
* 최악의 경우 시간복잡도 (Worst-case Time Complexity)
* 평균의 경우 시간복잡도 (Average-case Time Complexity)
* 최선의 경우 시간복잡도 (Best-case Time Complexity)

### 최악의 경우 시간복잡도
알고리즘이 수행할 단위연산의 최대 횟수를 고려하는 방법으로, W(n)은 입력크기 n에 대하여 알고리즘이 수행할 단위연산의 최대 횟수로 정의한다.

### 평균의 경우 시간복잡도
알고리즘이 수행할 단위연산의 평균 수행 횟수를 고려하는 방법으로, A(n)은 입력크기 n에 대하여 알고리즘이 수행할 단위연산의 평균 횟수로 정의한다.
A(n)을 계산하기 위해서 크기가 n인 입력에 각각 확률을 부여하여 계산한다.

### 최선의 경우 시간복잡도
알고리즘이 수행할 단위연산의 최소 수행 횟수를 고려하는 방법으로, B(n)은 입력크기 n에 대하여 알고리즘이 수행할 단위연산의 최소 횟수로 정의한다.

## Big O
```
주어진 복잡도 함수 f(n)에 대해서, O(f(n)) 은 n ≥ N 을 만족하는 모든 n에 대해 다음 부등식이 만족하는 양의 실수 c와 음이 아닌 정수 N이 존재하는 복잡도 함수 g(n)의 집합이다. (g(n) ∈ O(f(n)))
    g(n) ≤ c x f(n)
```
만약 g(n) ∈ O(f(n)) 이면, "g(n)은 f(n)의 Big O 이다" 라고 한다. g(n)은 궁극적으로 최소한 f(n)의 x차함수만큼은 좋다라고 말할 수 있다.
Big O는 함수의 궁극적인 상태만 고려하기 때문에 함수의 점근적인 (asymptotic) 상태를 나타낸다고 말한다. "Big O"는 함수의 점근적인 상향 (asymptotic upper bound)을 준다라고 한다.

## Ω (오메가)
```
주어진 복잡도 함수 f(n) 에 대해서, Ω(f(n))은 n ≥ N 을 만족하는 모든 n에 대해 다음식이 만족하는 양의 실수 c와 음이 아닌 정수 N이 존재하는 복잡도 함수 g(n) 의 집합이다. (g(n) ∈ Ω (f(n)))
    g(n) ≥ c x f(n)
```
만약 g(n) ∈ Ω (f(n)) 이면, "g(n)은 f(n)의 Ω이다" 라고 한다. g(n)은 궁극적으로 최소한 f(n)의 x차함수만큼은 나쁘다라고 말할 수 있다.

## 차수의 성질
1. g(n) ∈ O(f(n)) if and only if f(n) ∈ Ω (g(n))
2. g(n) ∈ Θ(f(n)) if and only if f(n) ∈ Θ (g(n))
3. b >1 이고 a > 1 이면, 다음이 성립한다.<br>
    log<sub>a</sub>n ∈ Θ(log<sub>b</sub>n)<br>
이는 모든 대수복잡도 함수가 같은 복잡도 카테고리에 속함을 암시한다. 이 카테고리는 Θ(log<sub>2</sub>n)으로 표시한다.
4. b > a > 0 이면, 다음이 성립한다.<br>
    a<sup>n</sup> ∈ o(b<sup>n</sup>)<br>
이는 모든 지수복잡도 함수가 같은 복잡도 카테고리에 속하지 않음을 암시한다.
5. a > 0 인 모든 a에 대해서, 다음이 성립한다.<br>
    a<sup>n</sup> ∈ o(n!)<br>
이는 n!이 어떤 지수복잡도 함수보다 나쁘다는 것을 암시한다.
6. 복잡도 카테고리들은 다음 순서로 나열할 수 있다.<br>
    Θ(log<sub>2</sub>n)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;Θ(n)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;Θ(nlog<sub>2</sub>n)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;Θ(n<sup>2</sup>)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;Θ(n<sup>j</sup>)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;Θ(n<sup>k</sup>)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;Θ(a<sup>n</sup>)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;Θ(b<sup>n</sup>)&nbsp;&nbsp;&nbsp;<&nbsp;&nbsp;&nbsp;Θ(n!)<br>
여기서 k > j > 2이고, b > a > 1 이다. 복잡도 함수 g(n)이 f(n)을 포함한 카테고리의 왼쪽에 위치한다고 하면, 다음이 성립한다.<br>
    g(n) ∈ o(f(n))
7. c ≥ 0, d ＞ 0, g(n) ∈ O(f(n)), h(n) ∈ θ(f(n))이면, 다음이 성립한다.
    c * g(n) + d * h(n) ∈ Θ(f(n))

# 알고리즘 설계 방식
## 분할정복법 (divide-and-conquer)
하향식 (top-down) 접근 방법으로, 해답을 구할 수 있을 만큼 상위 문제의 사례를 2개 이상의 하위 사례로 나누는 방식이다.
분할정복 설계전략은 다음과 같은 절차로 이루어진다.
1. 문제 사례를 하나 이상의 작은 사례로 <b>분할한다.</b>
2. 작은 사례들을 각각 <b>정복한다(푼다).</b> 작은 사례가 충분히 작지 않은 이상 재귀를 사용한다.
3. 필요하다면, 작은 사례에 대한 해답을 <b>통합(combine)</b>하여 원래 사례의 해답을 구한다.

<br>분할정복법에는 아래와 같은 알고리즘이 존재한다.
* 이분검색 (Binary Search)
* 합병정렬 (Merge Sort)
* 빠른정렬 (Quick Sort)


## 동적계획법 (dynamic programming)
상향식 (bottom-up) 접근 방법으로, 작은 사례를 먼저 해결하고, 그 결과를 저장한 다음 후에 그 결과가 필요할 때마다 다시 계산하는 대신 그 저장한 결과를 이용하는 방법이다.
피보나치 수열을 구하는 알고리즘에서 반복적 방법으로 구현한 것이 바로 동적계획법에 해당한다.

# Algorithm : Search 
## 순차 검색 (Sequential Search)
* Problem : n 개의 수로 구성된 배열 S에서 어떤 수 x의 위치를 구하라.
* Input : n은 양의 정수, S는 n개의 양의 정수로 구성된 배열, x는 양의 정수
* Output : S 안에 x의 위치, 만약 S에 x가 없다면 0
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
* 시간복잡도
  * 최악의 경우 : (n) 번 비교 = Ο (n)

## 이분 검색 (Binary Search)
* Problem : n 개의 수로 구성된 배열 S에서 어떤 수 x의 위치를 구하라.
* Input : n은 양의 정수, S는 n개의 양의 정수로 정렬된 배열, x는 양의 정수
* Output : S 안에 x의 위치, 만약 S에 x가 없다면 0
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
* 시간복잡도
  * 최악의 경우 : (log<sub>2</sub>n + 1) 번 비교 = Ο (log<sub>2</sub>n)

## 최적 이진검색 트리
### [Tree & Binary tree](https://ratsgo.github.io/data%20structure&algorithm/2017/10/21/tree/)

## BFS vs DFS
* [깊이 우선 탐색(DFS) 과 너비 우선 탐색(BFS)](https://yunyoung1819.tistory.com/86)
* [[그래프] DFS와 BFS 구현하기](https://mygumi.tistory.com/102)

# Algorithm : Sort
## 교환정렬 (exchange sort)
* Problem : n 개의 수로 구성된 배열 S를 비내림/올림차순으로 정렬하라
* Input : n은 양의 정수, S는 n개의 양의 정수로 구성된 배열
* Output : 비내림/올림차순으로 정렬된 배열
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
* 시간복잡도 (모든 경우 시간 복잡도)
<br>    T(n) = (n-1) + (n-2) + (n-3) + ... + 1
<br>           = n(n-1)/2
<br>          ∈ Θ(n<sup>2</sup>)

## 합병정렬 (merge sort)
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

* 시간 복잡도 (최악의 경우 시간 복잡도)
<br>    W(start, end) = end - start
<br>    W(n) = W(2/n) + W(2/n) + end - start + 1
<br>            = 2W(2/n) + n;
<br>            = nlog<sub>2</sub>n + n ∈ Θ (nlog<sub>2</sub>n)

    ## 빠른 정렬 (Quick Sort)
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

* 시간 복잡도 (최악의 경우 시간 복잡도)
<br>빠른 정렬에서 최악의 경우는 비내림차순으로 정렬된 배열을 정렬하는 경우에 가장 오래 걸린다.
이 때 분할에 필요한 시간복잡도 T(n) = n -1 이다. 따라서,
<br>    W(n) = 왼쪽 부분배열 정렬하는 데 걸리는 시간 + 오른쪽 부분배열 정렬하는데 걸리는 시간 + 분할하는데 걸리는 시간
<br>           = W(0) + W(n-1) + n - 1
<br>           = W(n-1) + n -1 (W(0) = 0)
<br>           = n(n-1) / 2
<br>           ∈ Θ(n<sup>2</sup>)
<br><br>빠른 정렬의 최악의 경우 시간 복잡도는 교환 정렬보다도 빠르지 않다. 그런데도 빠른 정렬이라고 부르는 이유는 평균의 경우 시간복잡도 때문이다.
* 시간 복잡도 (평균의 경우 시간 복잡도)
<br>    A(n) = (n+1)2log<sub>2</sub>n
<br>           = (n+1)2(log<sub>2</sub>2)(log<sub>2</sub>n)
<br>           ≒ 1.38(n+1)log<sub>2</sub>n
<br>           ∈ Θ(log<sub>2</sub>n)

# Algorithm : Etc
## 행렬곱셈 (Matrix Product)
* Problem : m x n, n x p 로 구성된 두 행렬의 곱을 구하라
* Input : m, n, p는 양의 정수
* Output : m x p 행렬 c 를 출력
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

## 피보나치 수열 (Fibonacci Sequence)
    피보나치 수열 정의
    f(0) = 0
    f(1) = 1
    f(n) = f(n-1) + f(n-2)

* Problem : 피보나치 수열에서 n번째 항을 결정하라
* Input : n은 음이 아닌 정수
* Output : n번째 항
* Pseudo code (재귀적 방법 ≒ 분할정복법)
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
* Pseudo code (반복적 방법)
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