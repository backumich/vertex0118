package com.vertex.prof.patterns;

import com.vertex.prof.data.sweets.Sweet;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class SweetStopLickerProxy implements Sweet {

    Sweet sweet;

    @Override
    public SweetType madeOf() {
        System.out.println("Attention, someone is trying to bite the sweet " + sweet);
        return sweet.madeOf();
    }

    @Override
    public int howSweet() {
        System.out.println("Attention, someone is trying to lick the sweet " + sweet);
        return sweet.howSweet();
    }
}
