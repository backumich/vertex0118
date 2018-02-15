package com.vertex.prof.patterns.wrapper;

import com.vertex.prof.data.sweets.Candy;
import com.vertex.prof.data.sweets.Sweet;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.awt.*;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class CandyWrapper implements Sweet {

    private Candy candy;
    private Color color;

    public Color getColor() {
        return color;
    }

    @Override
    public SweetType madeOf() {
        return candy.madeOf();
    }

    @Override
    public int howSweet() {
        return candy.howSweet();
    }
}
