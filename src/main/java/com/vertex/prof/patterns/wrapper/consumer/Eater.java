package com.vertex.prof.patterns.wrapper.consumer;

import com.vertex.prof.data.sweets.Sweet;

public interface Eater {

    void eat(Sweet sweet);

    void lick(Sweet sweet);

    Sweet bite(Sweet sweet);
}
