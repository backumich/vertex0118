package com.vertex.prof.generics.issues;

/**
 * Created by sweet_home on 04.03.17.
 */
public class Overloading<T extends String, U extends Byte> {

    public void myMethod(T t) {
        System.out.println("T" + t);
    }

    public void myMethod(U u) {
        System.out.println("U" + u);
    }


    public static void main(String[] args) {
        Overloading<String, Byte> overloading = new Overloading<>();
        overloading.myMethod("test");
        overloading.myMethod((byte)123);

    }
}
