# Algorithm?
�˰����̶� ������ ���� ���� ã�� �ܰ����� ����

# Algorithm : Search 
## ���� �˻� (Sequential Search)
* Problem : n ���� ���� ������ ����Ʈ S�� � �� x�� �����ϴ°�?
* Input : n�� ���� ����, S�� 1���� n������ ���� ���� �迭, x�� ���� ����
* Output: S �ȿ� x�� ��ġ�� ����Ű�� location, ���� S�� x�� �� ���ٸ� 0
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