package search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class GraphTraversal {

    public static void main(String[] args) {
        GraphTraversal gt = new GraphTraversal();

        int[][] a = new int[][] {
            {},
            { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 },
            { 0, 0, 1, 0, 1, 1, 0, 0, 0, 1 },
            { 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 },
            { 0, 0, 0, 1, 0, 0, 1, 1, 0, 0 },
            { 0, 0, 0, 0, 0, 1, 0, 1, 0, 0 },
            { 0, 0, 0, 0, 0, 1, 1, 0, 1, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
            { 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 },
        };

        gt.searchShortestDistance(a, 1, 8);
    }

    private void dfsWithRecursive(int[][] a, boolean[] c, int v) {
        c[v] = true;
        System.out.print(v + " ");

        final int n = a.length - 1;
        for (int i = 1; i <= n; i++) {
            if (a[v][i] == 1 && !c[i]) {
                dfsWithRecursive(a, c, i);
            }
        }
    }

    private void dfsWithStack(int[][] a) {
        Stack<Integer> stack = new Stack<>();
        boolean[] c = new boolean[a.length + 1];
        final int n = a.length - 1;

        int v = n;
        stack.push(v);
        c[v] = true;
        System.out.print(v + " ");

        int i;
        boolean pushed;
        while (!stack.isEmpty()) {
            v = stack.peek();
            pushed = false;

            for (i = 1; i <= n; i++) {
                if ((a[v][i] == 1) && !c[i]) {
                    stack.push(i);
                    c[i] = true;
                    System.out.print(i + " ");
                    pushed = true;
                    break;
                }
            }

            if (!pushed) {
                stack.pop();
            }
        }
    }

    private void bfsWithQueue(int[][] a) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] c = new boolean[a.length + 1];
        final int n = a.length - 1;

        int v = n;
        queue.add(v);

        int i;
        while (!queue.isEmpty()) {
            v = queue.poll();
            c[v] = true;
            System.out.print(v + " ");

            for (i = 1; i <= n; i++) {
                if ((a[v][i] == 1) && !c[i]) {
                    queue.add(i);
                    c[i] = true;
                }
            }
        }
    }

    private void searchShortestDistance(int[][] a, int start, int end) {
        Queue<Path> queue = new LinkedList<>();
        boolean[] c = new boolean[a.length + 1];
        final int n = a.length - 1;

        int v = start;
        List<Integer> path = new ArrayList<>();
        path.add(start);
        queue.add(new Path(start, path, 0));

        int i;
        Path p;
        boolean found = false;
        while (!queue.isEmpty()) {
            p = queue.poll();
            v = p.mCurrentPosition;
            c[v] = true;
            System.out.print(v + " ");

            if (v == end) {
                System.out.println("\nFound!! " + p.mPath + " (weight=" + p.mSumWeight + ")");
                found = true;
                break;
            }

            for (i = 1; i <= n; i++) {
                if ((a[v][i] > 0) && !c[i]) {
                    path = new ArrayList<>(p.mPath);
                    path.add(i);
                    queue.add(new Path(i, path, (p.mSumWeight + a[v][i])));
                    c[i] = true;
                }
            }
        }

        if (!found) {
            System.out.println("There is no way from " + start + " to " + end);
        }
    }

    class Path {
        int mCurrentPosition;
        List<Integer> mPath;
        int mSumWeight;

        Path(int position, List<Integer> path, int weight) {
            mCurrentPosition = position;
            mPath = path;
            mSumWeight = weight;
        }
    }
}
