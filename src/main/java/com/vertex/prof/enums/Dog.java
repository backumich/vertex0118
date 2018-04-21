package com.vertex.prof.enums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dog {
    private String name;
    private DogBreeds dogBreeds;
    private Color color;
    private double weight;
}

class CaneCorso extends Dog {}
