package base;

import static java.lang.System.out;

public class Operation {

    public static void main(String[] args) {
        Temp t1 = new Temp("1");
        Temp t2 = new Temp("1");
        // Temp t2 = t1;

        if (t1 == t2) {
            System.out.println("t1 == t2");
        } else {
            System.out.println("t1 != t2");
        }

        if (t1.equals(t2)) {
            System.out.println("t1 is equal to t2");
        } else {
            System.out.println("t1 is not equal to t2");
        }

        boolean a = false;
        boolean b = true;
        System.out.println("a&b = " + (a & b));
        System.out.println("a|b = " + (a | b));
        System.out.println("a^b = " + (a ^ b));

        StringBuilder sb = new StringBuilder(10);
        sb.append("12345");
        sb.append("67890");
        System.out.println(sb.toString() + "(capacity? " + sb.capacity() + ")");
        sb.append("abcde");
        System.out.println(sb.toString() + "(capacity? " + sb.capacity() + ")");

        Operation op = new Operation();
        op.testLabel();

        op.testArray();
        op.testArray(null);
    }

    private void testArray(int... arr) {
        if (arr == null) {
            out.println("arr is null.");
            return;
        }
        for (int i : arr) {
            out.print("i" + i);
        }
    }

    // private void testArray(int[] arr) {
    // for (int i : arr) {
    // out.print("i" + i);
    // }
    // }

    private void testLabel() {
        out.println("\n[START] testLabel");
        int i = 0;

        labelOfWhile: while (true) {
            for (; i < 10; i++) {
                out.println("i = " + i);
                if (i == 2) {
                    out.println("continue");
                    continue;
                }

                if (i == 4) {
                    out.println("break");
                    i++;
                    break;
                }

                if (i == 6) {
                    out.println("continue labelOfWhile");
                    i++;
                    continue labelOfWhile;
                }

                if (i == 8) {
                    out.println("break labelOfWhile");
                    break labelOfWhile;
                }
            }
        }
    }

    private void testSwitch() {
        char c = 'a';
        switch (c) {
        case 'a':
            break;
        }

        byte b = 0;
        switch (b) {
        case 0:
            break;
        }

        short s = 0;
        switch (s) {
        case 0:
            break;
        }

        int i = 0;
        switch (i) {
        case 0:
            break;
        }

        Character wrapChar = new Character('a');
        switch (wrapChar) {
        case 0:
            break;
        }

        Byte wrapByte = 0;
        switch (wrapByte) {
        case 0:
            break;
        }

        Short wrapShort = 0;
        switch (wrapShort) {
        case 0:
            break;
        }

        Integer wrapInt = 0;
        switch (wrapInt) {
        case 0:
            break;
        }

        // Since Java5
        Transportation trans = Transportation.BUS;
        switch (trans) {
        case BUS:
            break;
        }

        // Since Java7
        String str = "a";
        switch (str) {
        case "a":
            break;
        }
    }

    enum Transportation {
        BUS, METRO, WALK, CAR, BYCLE;
    }
}

class Temp {
    private String mStr;

    Temp(String s) {
        mStr = s;
    }

    @Override
    public boolean equals(Object obj) {
        if (Temp.class.isInstance(obj)) {
            Temp tObj = (Temp) obj;
            return (mStr != null) ? (mStr.equals(tObj.mStr)) : (tObj.mStr == null);
        }
        return false;
    }
}

