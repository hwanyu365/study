package base;

public class Generic {

    public static void main(String[] args) {
        MyList l = new MyList();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        l.remove();
        l.print();
    }
}

class MyList implements LList<String> {

    private Node<String> mHeader;
    private Node<String> mTail;

    @Override
    public void add(String t) {
        if (mHeader == null) {
            mHeader = new Node<String>(t);
        } else if (mTail == null) {
            mTail = new Node<String>(t);
            mHeader.mNext = mTail;
            mTail.mPrev = mHeader;
        } else {
            Node<String> n = new Node<>(t);
            Node<String> cTail = mTail;
            cTail.mNext = n;
            n.mPrev = cTail;
            mTail = n;
        }
    }

    @Override
    public String remove() {
        if (mHeader == null) {
            return null;
        } else if (mTail == null) {
            Node<String> header = mHeader;
            mHeader = null;
            return header.mT;
        } else if (mTail.mPrev == mHeader) {
            Node<String> tail = mTail;
            mTail = null;
            return tail.mT;
        } else {
            Node<String> tail = mTail;
            mTail = tail.mPrev;
            mTail.mNext = null;
            return tail.mT;
        }
    }

    class Node<T> {
        T mT;
        Node<T> mPrev;
        Node<T> mNext;

        Node(T t) {
            mT = t;
        }
    }

    void print() {
        if (mHeader == null) {
            System.out.print("Empty");
        } else if (mTail == null) {
            System.out.print(mHeader.mT);
        } else {
            StringBuilder sb = new StringBuilder();
            Node<String> t = mHeader;
            while (t != null) {
                sb.append(t.mT).append(", ");
                t = t.mNext;
            }

            int len = sb.length();
            if (len > 0) {
                sb.replace(len - 2, len, "");
            }
            System.out.print(sb.toString());
        }
    }
}

interface LList<T> {
    void add(T t);

    T remove();
}
