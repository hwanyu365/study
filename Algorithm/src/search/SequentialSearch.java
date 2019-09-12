package search;

public class SequentialSearch {

    public static void main(String[] args) {
        SequentialSearch ss = new SequentialSearch();
        System.out.println("3 is located at " + ss.getLocation(7, new int[]{1,2,3,4,5,6,7}, 1));
    }

    private int getLocation(int n, int[] S, int target) {
        for (int i=0; i<n; i++) {
            if (S[i]==target) {
                return ++i;
            }
        }
        return 0;
    }
}
