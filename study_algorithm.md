# Algorithm?
알고리즘이란 문제에 대한 답을 찾는 단계적인 절차

# Algorithm : Search 
## 순차 검색 (Sequential Search)
* Problem : n 개의 수로 구성된 리스트 S에 어떤 수 x가 존재하는가?
* Input : n은 양의 정수, S는 1에서 n까지의 수를 가진 배열, x는 양의 정수
* Output: S 안에 x의 위치를 가리키는 location, 만약 S에 x의 가 없다면 0
* Pseudo code
    ```java
    private int getLocation(int n, int[] S, int target) {
        for (int i=0; i<n; i++) {
            if (S[i]==target) {
                return ++i;
            }
        }
        return 0;
    }
    ```

## bfs, dfs

# Algorithm : Sort