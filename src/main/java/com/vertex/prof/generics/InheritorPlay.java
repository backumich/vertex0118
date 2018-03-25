package com.vertex.prof.generics;

import com.vertex.prof.util.Fruit;
import com.vertex.prof.util.Jonathan;

import java.util.ArrayList;
import java.util.List;

public class InheritorPlay {

    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();

        fruits.add(new Jonathan());

        Fruit fruit = fruits.get(0);
    }
}
