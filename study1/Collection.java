package study1;

import java.util.*;
public class Collection {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        //LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add(1, "C");
        System.out.println(linkedList); // A C B

        //HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("A");
        System.out.println(hashSet);

        //LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        System.out.println(linkedHashSet);

        //TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");
        System.out.println(treeSet); // A B C 자동정렬

        //HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        System.out.println(hashMap);

        //LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("two", 2);
        linkedHashMap.put("one", 1);
        linkedHashMap.put("three", 3);
        System.out.println(linkedHashMap); // 넣은 순서대로 나옴

        //TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("C", 3);
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        System.out.println(treeMap); // 정렬된 순서대로 나옴
    }
}
