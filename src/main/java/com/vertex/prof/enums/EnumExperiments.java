package com.vertex.prof.enums;

import java.util.Arrays;
import java.util.EnumSet;

import static com.vertex.prof.enums.DogBreeds.*;

public class EnumExperiments {

    public static void main(String[] args) {
        Dog kuzia = Dog.builder()
                .dogBreeds(PEKINES)
                .name("Kuzia")
                .weight(6)
                .build();

        Arrays.stream(DogBreeds.values())
                .map(breed -> breed.toString() + " " + (breed.ordinal() + 1))
                .forEach(System.out::println);

        System.out.println(EnumSet.range(COLLY, PEKINES));
    }

}
