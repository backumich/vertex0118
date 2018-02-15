package com.vertex.prof.data.sweets;

public interface Sweet {

    SweetType madeOf();
    int howSweet();

    enum SweetType{
        CHOCOLATE, JELLY, MARMALADE, ICE_CREAM
    }
}
