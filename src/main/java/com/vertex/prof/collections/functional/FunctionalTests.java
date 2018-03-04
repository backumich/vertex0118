package com.vertex.prof.collections.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalTests {

    private static String outerString = "two";

    public static void main(String[] args) {

//        functionalInterfacesGame();

//        functionRefferenseGame();


//        streamPlay();


        List<String> list = new ArrayList<>();
        Collections.addAll(list, "hihi", "hello", "a", "B", "c");

        Stream<String> stringStream = list.stream()
                .filter(string -> string.length() > 3);

        list.add("slknfojnaefb");

        stringStream.forEach(System.out::println);


    }

    private static void streamPlay() {
        List<String> collect = Stream.of("hihi", "hello", "a", "B", "c")
                .filter(string -> string.length() > 3)
                .limit(2)
                .skip(1)
                .map(FunctionalTests::getStringDescription)
                .collect(Collectors.toList());

        System.out.println(collect);
//                .forEach(System.out::println);
    }



    private static String getStringDescription(String string) {
        return "String : '" + string + "' with length : " + string.length();
    }

    private static void functionRefferenseGame() {
        String[] words =
                {"hi", "hello", "a", "B", "c" };

        Arrays.sort(words, String::compareToIgnoreCase);
    }

    private static void functionalInterfacesGame() {
        String one = "one";
        String two = outerString;


        Supplier test = () -> {
            boolean result = one.equalsIgnoreCase(two);

            String notOne;
            if (!result) {
//                one=outerString; //can't change outer variables
                notOne = one;
            }

            System.out.println(result);
            return result;
        };

        test.get();
    }
}
