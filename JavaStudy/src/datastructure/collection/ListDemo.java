package datastructure.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ListDemo {

    public static void main(String[] args) {
        ListDemo demo = new ListDemo();
        System.out.println("----Vector----");
        demo.testVector();
        System.out.println("----ArrayList----");
        demo.testArrayList();
    }

    private void testVector() {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("C");

        Enumeration<String> elements = vector.elements();
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }
    }

    private void testArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");

//        ArrayList<String> snapList = new ArrayList<>(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "/" + list.size());
            iterator.remove();
        }

        System.out.println("----list----");
        for (String item : list) {
            System.out.println(item + "/" + list.size());
        }
//        
//        System.out.println("----snapList----");
//        for(String item : snapList) {
//            System.out.println(item);
//        }
    }
}
