package com.vertex.prof.collections.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ReducePlay {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1,3,5);

//       parallelStream: (1+identity) * (3+identity) * (5+identity)
//       stream: 1 + 3 + 5 + identity
        Stream<Integer> integerStream = numbers.parallelStream();

        numbers.add(7);

        Integer sum = integerStream
                .reduce(1, (left, right) -> left + right, (identity, result) -> identity * result);

//        integerStream.forEach(System.out::print);

        System.out.println(sum); //output varies
        System.out.println(numbers);

    }
}
