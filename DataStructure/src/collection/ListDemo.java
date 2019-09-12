package collection;

import java.util.Enumeration;
import java.util.Vector;

public class ListDemo {

    public static void main(String[] args) {
        ListDemo demo =new ListDemo();
        demo.testArrayList();
    }

    private void testArrayList() {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("C");

        Enumeration<String> elements = vector.elements();

        while(elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }
    }
}
