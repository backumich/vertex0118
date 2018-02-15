package com.vertex.prof.arrays;

import com.vertex.prof.data.A;
import com.vertex.prof.data.sweets.Candy;
import com.vertex.prof.data.sweets.Sweet;
import com.vertex.prof.data.sweets.SweetComparator;

import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        A[] arrayOfA1 = new A[10];
//        arrayOfA1[0] = new A();
//
//        A[] arrayOfA2 = new A[10];
//        arrayOfA2[0] = arrayOfA1[0];
//
//        System.out.println(arrayOfA1 == arrayOfA2);
//        System.out.println(arrayOfA1.equals(arrayOfA2));
//        System.out.println(Arrays.equals(arrayOfA1, arrayOfA2));
//        System.out.println(Arrays.deepEquals(arrayOfA1, arrayOfA2));

        Candy[] candies = {new Candy(Sweet.SweetType.MARMALADE, 5),
            new Candy(Sweet.SweetType.CHOCOLATE, 5),
            new Candy(Sweet.SweetType.CHOCOLATE, 2),
            new Candy(Sweet.SweetType.JELLY, 3)};

        System.out.println(Arrays.toString(candies));

        Arrays.sort(candies);
        System.out.println(Arrays.toString(candies));

        Arrays.sort(candies, new SweetComparator());
        System.out.println(Arrays.toString(candies));

    }
}
