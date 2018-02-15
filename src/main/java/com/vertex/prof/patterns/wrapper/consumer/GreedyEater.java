package com.vertex.prof.patterns.wrapper.consumer;

import com.vertex.prof.data.sweets.Sweet;

public class GreedyEater implements Eater {

    @Override
    public void eat(Sweet sweet) {
        System.out.println("I like sweets, I'm going to eat " + sweet);
    }

    @Override
    public void lick(Sweet sweet) {
        System.out.println("Like sweets so much! So sweet " + sweet.howSweet());
        eat(sweet);
        System.out.println("Om nom nom");
    }

    @Override
    public Sweet bite(Sweet sweet) {
        System.out.println("Can't just bite. Oh, it's made of " + sweet.madeOf());
        eat(sweet);
        System.out.println("Om nom nom");
        return null;
    }
}
