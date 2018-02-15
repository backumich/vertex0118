package com.vertex.prof.patterns.wrapper;

import com.vertex.prof.patterns.wrapper.consumer.Eater;
import com.vertex.prof.patterns.wrapper.consumer.GreedyEater;
import com.vertex.prof.data.sweets.Candy;
import com.vertex.prof.data.sweets.Sweet;
import com.vertex.prof.patterns.SweetStopLickerProxy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Eater eater = new GreedyEater();

        List<Candy> candies = Arrays.asList(new Candy(Sweet.SweetType.CHOCOLATE, 5),
                new Candy(Sweet.SweetType.MARMALADE, 5),
                new Candy(Sweet.SweetType.JELLY, 3));

        candies.forEach(eater::bite);
        candies.forEach(eater::lick);
        candies.forEach(eater::eat);

        List<SweetStopLickerProxy> noLickingSweets = candies.stream()
                .map(SweetStopLickerProxy::new)
                .collect(Collectors.toList());

        noLickingSweets.forEach(eater::eat);
        noLickingSweets.forEach(eater::lick);
        noLickingSweets.forEach(eater::bite);

    }
}
