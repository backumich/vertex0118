package com.vertex.prof.data.sweets;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Candy implements Sweet, Comparable<Candy> {

    private SweetType sweetType;
    private int howSweet;

    @Override
    public SweetType madeOf() {
        return sweetType;
    }

    @Override
    public int howSweet() {
        return howSweet;
    }

    @Override
    public int compareTo(Candy that) {
//        return this.howSweet > that.howSweet ? 1 : this.howSweet == that.howSweet ? 0 : -1;
        return Integer.compare(this.howSweet, that.howSweet);
    }
}
