package com.vertex.prof.data.sweets;

import java.util.Comparator;

public class SweetComparator implements Comparator<Sweet> {
    @Override
    public int compare(Sweet left, Sweet right) {
        Comparator<Sweet> sweetComparator = Comparator.comparing(Sweet::howSweet)
                .reversed()
                .thenComparing(Sweet::madeOf);
        return sweetComparator.compare(left, right);
    }
}
