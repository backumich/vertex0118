package com.vertex.prof.generics.unbound.wildcard;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards1 {
    private static List list1;
    private static List<?> list2;
    private static List<? extends Object> list3;

    private static void assign1(List list) {
        list1 = list;
        list2 = list;
        list3 = list; // Warning: unchecked conversion
//         Found: List, Required: List<? extends Object>
    }

    private static void assign2(List<?> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    private static void assign3(List<? extends Object> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    public static void main(String[] args) {
        assign1(new ArrayList());
        assign2(new ArrayList());
        assign3(new ArrayList());
        List<Object> list = new ArrayList<>();
        list.add(new Object());
        assign3(list); // Warning:
        // Unchecked conversion. Found: ArrayList
        // Required: List<? extends Object>

        assign1(new ArrayList<String>());
        assign2(new ArrayList<String>());
        assign3(new ArrayList<>());

        // Both forms are acceptable as List<?>:
        List<?> wildList = new ArrayList();
        wildList = new ArrayList<Exception>();
        assign1(wildList);
        assign2(wildList);
        assign3(wildList);
    }
}
