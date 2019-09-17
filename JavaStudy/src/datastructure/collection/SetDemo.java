package datastructure.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        List<String> srcs = new ArrayList<>();
        srcs.add("Bwerwr");
        srcs.add("A");
        srcs.add("Dwefw");
        srcs.add("C");
        srcs.add("C");
        srcs.add("C");
        SetDemo setDemo = new SetDemo();
        setDemo.testHashSet(srcs);
        setDemo.testTreeSet(srcs);
        setDemo.testLinkedSet(srcs);
    }

    private void testHashSet(List<String> srcs) {
        System.out.println("=====HashSet Demo=====");
        Set<String> set = new HashSet<>();
        set.addAll(srcs);
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private void testTreeSet(List<String> srcs) {
        System.out.println("=====TreeSet Demo=====");
        Set<String> set = new TreeSet<>();
        set.addAll(srcs);
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private void testLinkedSet(List<String> srcs) {
        System.out.println("=====LinkedSet Demo=====");
        Set<String> set = new LinkedHashSet<>();
        set.addAll(srcs);
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
