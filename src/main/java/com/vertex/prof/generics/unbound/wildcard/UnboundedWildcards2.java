package com.vertex.prof.generics.unbound.wildcard;


import java.util.HashMap;
import java.util.Map;

public class UnboundedWildcards2 {
    private static Map map1;
    private static Map<?, ?> map2;
    private static Map<String, ?> map3;

    private static void assign1(Map map) {
        map1 = map;
    }

    private static void assign2(Map<?, ?> map) {
        map2 = map;
    }

    private static void assign3(Map<String, ?> map) {
        map3 = map;
    }

    public static void main(String[] args) {
        assign1(new HashMap());
        assign2(new HashMap());
        assign3(new HashMap()); // Warning:
        // Unchecked conversion. Found: HashMap
        // Required: Map<String,?>
        assign1(new HashMap<String, Integer>());
        assign2(new HashMap<String, Integer>());
        assign3(new HashMap<String, Integer>());
    }
}
