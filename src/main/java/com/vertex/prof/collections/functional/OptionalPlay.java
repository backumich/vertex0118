package com.vertex.prof.collections.functional;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

public class OptionalPlay {

    public static void main(String[] args) {

        Person manager = new Person(null, "Petro");
        Person worker = new Person(manager, "Vasyl");
        Person person = null;

        String bossName = Optional.ofNullable(worker)
                .map(p -> p.boss)
                .map(p -> p.name)
                .map(name -> "Boss's name is: " + name)
                .orElseGet(() -> "No name or no boss");

        System.out.println(bossName);

    }

    @Data
    @AllArgsConstructor
    private static class Person {
        private Person boss;
        private String name;
    }

}
