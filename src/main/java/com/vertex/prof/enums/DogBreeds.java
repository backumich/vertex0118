package com.vertex.prof.enums;

import lombok.AllArgsConstructor;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@AllArgsConstructor
public enum DogBreeds {
    CANE_CORSO("Cane Corso", CaneCorso::builder),
    COLLY("Colly", Dog::builder),
    LABRADOR("Labrador", Dog::builder),
    KING_DOG("King Dog", Dog::builder),
    PEKINES("Pekines", Dog::builder);

    private String realName;
    private Supplier<Dog.DogBuilder> builder;


    public List<Color> possibleColors(){
        return new ArrayList<>();
    }

    public Dog born(String name, double weight){
        return builder.get()
                .name(name)
                .weight(weight)
                .color(possibleColors().stream()
                        .findAny()
                        .orElse(Color.BLACK))
                .dogBreeds(this)
                .build();
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return "My toString " + name();
    }

}
