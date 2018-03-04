package com.vertex.prof.collections;

import com.vertex.prof.data.sweets.Candy;
import com.vertex.prof.data.sweets.Sweet;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        LinkedHashSet<Candy> hashSet = new LinkedHashSet<>();
//
//        for (int i = 0; i < 100000; i++) {
//            hashSet.add(new Candy(Sweet.SweetType.CHOCOLATE, 3));
//            hashSet.add(new Candy(Sweet.SweetType.MARMALADE, 2));
//            hashSet.add(new Candy(Sweet.SweetType.JELLY, 4));
//            hashSet.add(null);
//        }
//
//        Spliterator<Candy> spliterator = hashSet.spliterator();
//        logSpliteratorData("Initial", hashSet, spliterator);
//
//        Spliterator<Candy> headSpliterator;
//        for (int i = 0; i < 5; i++) {
//            headSpliterator = spliterator.trySplit();
//            logSpliteratorData("Head", hashSet, headSpliterator);
//            logSpliteratorData("Tail", hashSet, spliterator);
//
//        }


//        HashMap<String, String> hashMap = new HashMap<>();
//
//        hashMap.putIfAbsent("test", "test");
//        System.out.println(hashMap);
//
//        hashMap.merge("test1", "2", (key, value) -> "notTest");
//        System.out.println(hashMap);
//
//        hashMap.merge("test1", "2", (key, value) -> "notTest");
//        System.out.println(hashMap);

//        Map<String, Boolean> map = new HashMap<>();
//
//        Set<String> set = Collections.newSetFromMap(map);
//        System.out.println(set);
//
//        map.put("first", true);
//        map.put("second", false);
//        map.put("third", true);
//        map.put("forth", true);
//
//        System.out.println(set);
//
//        set.add("Fifth");
//
//        System.out.println(map);

        Comparator<Sweet> sweetComparator = Collections.reverseOrder();
        System.out.println(sweetComparator.compare(
                new Candy(Sweet.SweetType.MARMALADE, 4),
                new Candy(Sweet.SweetType.MARMALADE, 3)));

    }


    public Object bake(List<String> ingredients) {
        if (       ingredients.contains("orange juice")
                && ingredients.contains("milk")
                && ingredients.contains("flour")) {
            System.out.println("some");
        }

        return null;
    }

    private static void logSpliteratorData(String name, LinkedHashSet<Candy> hashSet, Spliterator<Candy> spliterator) {
        System.out.println("Name : " + name);
        System.out.println("Exact size : " + hashSet.size());
        System.out.println("Exact size from spliterator: " + (spliterator != null ? spliterator.getExactSizeIfKnown() : null));
        System.out.println("Estimate size from spliterator: " + (spliterator != null ? spliterator.estimateSize() : null));
    }
}
