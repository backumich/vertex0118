package com.vertex.prof.generics.wildcard;


import com.vertex.prof.util.Apple;
import com.vertex.prof.util.Fruit;

import java.util.ArrayList;
import java.util.List;

public class NonCovariantGenerics {
    // Compile Error: incompatible types:
//    List<Fruit> flist = new ArrayList<Apple>();
}
